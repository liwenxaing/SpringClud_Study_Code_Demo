package com.micro.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class App_3324_Config {
    public static void main(String[] args) {
        SpringApplication.run(App_3324_Config.class,args);
    }
}
