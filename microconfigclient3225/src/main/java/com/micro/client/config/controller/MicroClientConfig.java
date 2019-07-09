package com.micro.client.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroClientConfig {

       @Value("${spring.application.name}")
       private String applicationName;

       @Value("${eureka.client.service-url.defaultZone}")
       private String eurekaDefaultZone;

       @Value("${server.port}")
       private String port;

       @RequestMapping("/getConfig")
       public String getConfig(){
           String str = "applicationName"+applicationName+"\teurekaDefaultZone"+eurekaDefaultZone+"\tport"+port;
           System.out.println(str);
           return str;
       }

}
