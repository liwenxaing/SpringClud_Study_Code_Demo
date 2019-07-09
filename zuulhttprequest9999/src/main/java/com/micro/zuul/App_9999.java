package com.micro.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class App_9999 {
    public static void main(String[] args) {
        SpringApplication.run(App_9999.class,args);
    }
}
