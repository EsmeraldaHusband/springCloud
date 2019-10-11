package com.cloud.demo.controller;

import com.cloud.demo.service.GetAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class ConsumeController {
    @Resource
    private GetAuthorService getAuthorService ;

    @Autowired
    private RestTemplate restTemplate ;

    //服务名不能下划线
    String server_name = "eureka-client-provider" ;

    @RequestMapping("/showInfo")
    public Map<String,String> showInfo (){
        return restTemplate.getForObject("http://"+server_name+":8001/getInfo",Map.class) ;
    }

    @RequestMapping(value = "/getAuthorInfo")
    public String getAuthorInfo () {
        return getAuthorService.getAuthorInfo("测试");
    }


}
