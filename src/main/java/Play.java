import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;


import java.util.List;


public class Play {

    public static void main(String[] args) {
        System.out.println();
        DockerClientConfig config = DefaultDockerClientConfig
                .createDefaultConfigBuilder()
                .withDockerHost("tcp://192.168.99.100:2376")
                .withDockerTlsVerify(true)
                .withDockerCertPath(System.getProperty("user.home") + "/.docker/machine/machines/default")
                .build();
        DockerClient client = DockerClientBuilder.getInstance(config).build();
        List<Container> containers = client.listContainersCmd().exec();
        System.out.println("container numbers: " + containers.size());
    }
}
