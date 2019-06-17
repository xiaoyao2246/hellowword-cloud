package com.xiaojian.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //本服务启动后会注册到eureka服务中
@EnableDiscoveryClient //开启服务发现
public class DeptProvider8001 {


    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001.class, args);
    }
}
