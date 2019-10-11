package com.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 注册中心注解
public class EurekaSericeApplication_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaSericeApplication_7001.class,args) ;
    }
}
