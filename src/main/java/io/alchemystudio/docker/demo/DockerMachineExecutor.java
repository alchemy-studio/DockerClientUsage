package io.alchemystudio.docker.demo;

import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientConfig;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DockerMachineExecutor {
    public static String getDockerHost() {
        try {
            return _getDockerHost();
        } catch (Exception e) {
            return null;
        }
    }

    private static String _getDockerHost() throws Exception {
        Runtime rt = Runtime.getRuntime();

        // 后面两个参数要隔开成两个独立的string
        String[] commands = {"docker-machine", "env", "default"};

        Process proc = rt.exec(commands);

        InputStream stdIn = proc.getInputStream();
        InputStreamReader isr = new InputStreamReader(stdIn);
        BufferedReader br = new BufferedReader(isr);

        String line = null;

        Pattern dockerHostPattern = Pattern.compile(".*DOCKER_HOST=\"(.*)\".*");

        while ((line = br.readLine()) != null) {
            Matcher m = dockerHostPattern.matcher(line);
            if (m.matches()) {
                return m.group(1);
            }
        }
        return null;
    }

    public static String getCertPath() {
        // todo: 做通用功能
        return System.getProperty("user.home") + "/.docker/machine/machines/default";
    }

    public static DockerClientConfig createDefaultConfig() {
        return DefaultDockerClientConfig
                .createDefaultConfigBuilder()
                .withDockerHost(DockerMachineExecutor.getDockerHost())
                .withDockerTlsVerify(true)
                .withDockerCertPath(DockerMachineExecutor.getCertPath())
                .build();
    }
}
