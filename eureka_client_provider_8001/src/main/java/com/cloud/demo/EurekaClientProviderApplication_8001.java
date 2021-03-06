package com.cloud.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient    // 本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.cloud.engine.mapper"})
public class EurekaClientProviderApplication_8001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProviderApplication_8001.class,args) ;
    }
}
