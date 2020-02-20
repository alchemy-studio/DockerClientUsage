## Docker Java客户端的demo

运行这个demo需要本地跑起来docker的服务：

```bash
$ docker-machine ls
NAME      ACTIVE   DRIVER       STATE     URL                         SWARM   DOCKER     ERRORS
default   *        virtualbox   Running   tcp://192.168.99.100:2376           v19.03.5
$
```

编译项目：

```bash
$ mvn clean install
```

执行demo：

```bash
$ mvn -q exec:java -Dexec.mainClass="io.alchemystudio.docker.demo.Play"
```

执行结果：

```txt
0    [io.alchemystudio.docker.demo.Play.main()] DEBUG com.github.dockerjava.core.command.AbstrDockerCmd  - Cmd: -1,<null>,false,<null>,<null>,com.github.dockerjava.core.util.FiltersBuilder@0,com.github.dockerjava.jaxrs.ListContainersCmdExec@246e90cc
235  [io.alchemystudio.docker.demo.Play.main()] DEBUG com.github.dockerjava.jaxrs.JerseyDockerCmdExecFactory  - 1 * Sending client request on thread io.alchemystudio.docker.demo.Play.main()
1 > GET https://192.168.99.100:2376/containers/json
1 > Accept: application/json

244  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.client.protocol.RequestAddCookies  - CookieSpec selected: default
249  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.client.protocol.RequestAuthCache  - Auth cache not set in the context
249  [io.alchemystudio.docker.demo.Play.main()] DEBUG com.github.dockerjava.jaxrs.JerseyDockerCmdExecFactory$1  - Connection request: [route: {s}->https://192.168.99.100:2376][total kept alive: 0; route allocated: 0 of 2; total allocated: 0 of 20]
256  [io.alchemystudio.docker.demo.Play.main()] DEBUG com.github.dockerjava.jaxrs.JerseyDockerCmdExecFactory$1  - Connection leased: [id: 0][route: {s}->https://192.168.99.100:2376][total kept alive: 0; route allocated: 1 of 2; total allocated: 1 of 20]
257  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.impl.execchain.MainClientExec  - Opening connection {s}->https://192.168.99.100:2376
258  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.impl.conn.DefaultHttpClientConnectionOperator  - Connecting to /192.168.99.100:2376
258  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.conn.ssl.SSLConnectionSocketFactory  - Connecting socket to /192.168.99.100:2376 with timeout 0
259  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.conn.ssl.SSLConnectionSocketFactory  - Enabled protocols: [TLSv1.2, TLSv1.1, TLSv1]
259  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.conn.ssl.SSLConnectionSocketFactory  - Enabled cipher suites:[TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, TLS_RSA_WITH_AES_256_GCM_SHA384, TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384, TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384, TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, TLS_RSA_WITH_AES_128_GCM_SHA256, TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256, TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256, TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384, TLS_RSA_WITH_AES_256_CBC_SHA256, TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384, TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384, TLS_DHE_RSA_WITH_AES_256_CBC_SHA256, TLS_DHE_DSS_WITH_AES_256_CBC_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, TLS_RSA_WITH_AES_256_CBC_SHA, TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA, TLS_ECDH_RSA_WITH_AES_256_CBC_SHA, TLS_DHE_RSA_WITH_AES_256_CBC_SHA, TLS_DHE_DSS_WITH_AES_256_CBC_SHA, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256, TLS_RSA_WITH_AES_128_CBC_SHA256, TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256, TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256, TLS_DHE_RSA_WITH_AES_128_CBC_SHA256, TLS_DHE_DSS_WITH_AES_128_CBC_SHA256, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, TLS_RSA_WITH_AES_128_CBC_SHA, TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA, TLS_ECDH_RSA_WITH_AES_128_CBC_SHA, TLS_DHE_RSA_WITH_AES_128_CBC_SHA, TLS_DHE_DSS_WITH_AES_128_CBC_SHA, TLS_EMPTY_RENEGOTIATION_INFO_SCSV]
287  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.conn.ssl.SSLConnectionSocketFactory  - Starting handshake
309  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.conn.ssl.SSLConnectionSocketFactory  - Secure session established
310  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.conn.ssl.SSLConnectionSocketFactory  -  negotiated protocol: TLSv1.2
310  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.conn.ssl.SSLConnectionSocketFactory  -  negotiated cipher suite: TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384
310  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.conn.ssl.SSLConnectionSocketFactory  -  peer principal: O=weli.default
310  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.conn.ssl.SSLConnectionSocketFactory  -  peer alternative names: [localhost, 192.168.99.100]
310  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.conn.ssl.SSLConnectionSocketFactory  -  issuer principal: O=weli
312  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.impl.conn.DefaultHttpClientConnectionOperator  - Connection established 192.168.99.1:62209<->192.168.99.100:2376
312  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.impl.execchain.MainClientExec  - Executing request GET /containers/json HTTP/1.1
312  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.impl.execchain.MainClientExec  - Target auth state: UNCHALLENGED
312  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.impl.execchain.MainClientExec  - Proxy auth state: UNCHALLENGED
313  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.headers  - http-outgoing-0 >> GET /containers/json HTTP/1.1
313  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.headers  - http-outgoing-0 >> Accept: application/json
313  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.headers  - http-outgoing-0 >> User-Agent: Jersey/2.27 (Apache HttpClient 4.5.6)
313  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.headers  - http-outgoing-0 >> Host: 192.168.99.100:2376
313  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.headers  - http-outgoing-0 >> Connection: Keep-Alive
313  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.headers  - http-outgoing-0 >> Accept-Encoding: gzip,deflate
313  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.wire  - http-outgoing-0 >> "GET /containers/json HTTP/1.1[\r][\n]"
313  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.wire  - http-outgoing-0 >> "Accept: application/json[\r][\n]"
313  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.wire  - http-outgoing-0 >> "User-Agent: Jersey/2.27 (Apache HttpClient 4.5.6)[\r][\n]"
313  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.wire  - http-outgoing-0 >> "Host: 192.168.99.100:2376[\r][\n]"
313  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.wire  - http-outgoing-0 >> "Connection: Keep-Alive[\r][\n]"
313  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.wire  - http-outgoing-0 >> "Accept-Encoding: gzip,deflate[\r][\n]"
313  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.wire  - http-outgoing-0 >> "[\r][\n]"
314  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.wire  - http-outgoing-0 << "HTTP/1.1 200 OK[\r][\n]"
314  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.wire  - http-outgoing-0 << "Api-Version: 1.40[\r][\n]"
314  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.wire  - http-outgoing-0 << "Content-Type: application/json[\r][\n]"
314  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.wire  - http-outgoing-0 << "Docker-Experimental: false[\r][\n]"
314  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.wire  - http-outgoing-0 << "Ostype: linux[\r][\n]"
314  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.wire  - http-outgoing-0 << "Server: Docker/19.03.5 (linux)[\r][\n]"
314  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.wire  - http-outgoing-0 << "Date: Thu, 20 Feb 2020 03:21:33 GMT[\r][\n]"
314  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.wire  - http-outgoing-0 << "Content-Length: 3[\r][\n]"
314  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.wire  - http-outgoing-0 << "[\r][\n]"
315  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.wire  - http-outgoing-0 << "[][\n]"
316  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.headers  - http-outgoing-0 << HTTP/1.1 200 OK
316  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.headers  - http-outgoing-0 << Api-Version: 1.40
316  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.headers  - http-outgoing-0 << Content-Type: application/json
316  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.headers  - http-outgoing-0 << Docker-Experimental: false
316  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.headers  - http-outgoing-0 << Ostype: linux
316  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.headers  - http-outgoing-0 << Server: Docker/19.03.5 (linux)
316  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.headers  - http-outgoing-0 << Date: Thu, 20 Feb 2020 03:21:33 GMT
316  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.headers  - http-outgoing-0 << Content-Length: 3
318  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.impl.execchain.MainClientExec  - Connection can be kept alive indefinitely
323  [io.alchemystudio.docker.demo.Play.main()] DEBUG com.github.dockerjava.jaxrs.JerseyDockerCmdExecFactory  - 2 * Client response received on thread io.alchemystudio.docker.demo.Play.main()
2 < 200
2 < Api-Version: 1.40
2 < Content-Length: 3
2 < Content-Type: application/json
2 < Date: Thu, 20 Feb 2020 03:21:33 GMT
2 < Docker-Experimental: false
2 < Ostype: linux
2 < Server: Docker/19.03.5 (linux)
[]


333  [io.alchemystudio.docker.demo.Play.main()] DEBUG com.github.dockerjava.jaxrs.JerseyDockerCmdExecFactory$1  - Connection [id: 0][route: {s}->https://192.168.99.100:2376][state: O="weli.<bootstrap>"] can be kept alive indefinitely
333  [io.alchemystudio.docker.demo.Play.main()] DEBUG org.apache.http.impl.conn.DefaultManagedHttpClientConnection  - http-outgoing-0: set socket timeout to 0
334  [io.alchemystudio.docker.demo.Play.main()] DEBUG com.github.dockerjava.jaxrs.JerseyDockerCmdExecFactory$1  - Connection released: [id: 0][route: {s}->https://192.168.99.100:2376][state: O="weli.<bootstrap>"][total kept alive: 1; route allocated: 1 of 2; total allocated: 1 of 20]
container numbers: 0
$
```


