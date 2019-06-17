package com.xiaojian.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //eureka服务端启动类,接受其他微服务注册
public class EurekaService7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaService7001.class, args);
    }
}
