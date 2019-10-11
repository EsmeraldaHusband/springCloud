package com.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient    // 本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
@EnableSwagger2
public class EurekaClientCustomerApplication_6001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientCustomerApplication_6001.class,args) ;
    }
}
