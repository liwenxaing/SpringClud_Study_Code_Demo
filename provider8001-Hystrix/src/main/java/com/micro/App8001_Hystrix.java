package com.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//开启熔断机制
@EnableCircuitBreaker
public class App8001_Hystrix {
    public static void main(String[] args) {
        SpringApplication.run(App8001_Hystrix.class,args);
    }
}
