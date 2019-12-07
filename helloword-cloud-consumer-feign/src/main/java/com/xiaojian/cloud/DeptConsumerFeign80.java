package com.xiaojian.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "HELLOWORD-CLOUD-PROVIDER", configuration = MyRule.class)
@EnableFeignClients(basePackages = {"com.xiaojian.cloud"})
@ComponentScan("com.xiaojian.cloud")
public class DeptConsumerFeign80 {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign80.class, args);
    }

}
