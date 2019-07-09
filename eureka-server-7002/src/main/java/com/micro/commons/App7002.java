package com.micro.commons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class App7002 {
    public static void main(String[] args) {
        SpringApplication.run(App7002.class,args);
    }
}
