package com.cloud.demo.config;

import feign.Retryer;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class FeignConfig {
    @Bean
    public Retryer feignRetryer () {
        return new Retryer.Default(100,1, 5);
    }
}
