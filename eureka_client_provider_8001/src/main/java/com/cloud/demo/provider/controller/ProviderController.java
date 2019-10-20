package com.cloud.demo.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProviderController {

    private static final Logger LOG = LoggerFactory.getLogger(ProviderController.class) ;

    @RequestMapping("/getInfo")
    public Map<String,String> getInfo (){
        LOG.info("ProviderController-8001 提供服务");
        Map<String,String> infoMap = new HashMap<>() ;
        infoMap.put("主题：","SpringCloud微服务框架") ;
        infoMap.put("服务：","SProviderController-8001 提供服务") ;
        return infoMap ;
    }

    @RequestMapping(value = "/getAuthorInfo/{authorId}",method = RequestMethod.GET)
    public String getAuthorInfo (@PathVariable("authorId") String authorId) {
        LOG.info("provider-8001");
        return "SpringCloud微服务框架—8001-"+authorId ;
    }
}
