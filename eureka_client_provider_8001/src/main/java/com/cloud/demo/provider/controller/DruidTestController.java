package com.cloud.demo.provider.controller;


import com.cloud.demo.provider.entity.SysEmployee;
import com.cloud.demo.provider.service.SysEmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/druidTest")
public class DruidTestController {
    private static final Logger LOG = LoggerFactory.getLogger(ProviderController.class) ;

    @Autowired
    private SysEmployeeService sysEmployeeService;

    @RequestMapping("/getEmployee")
    public Map<String,String> getEmployee (){
        LOG.info("ProviderController-8001 提供服务");
        Map<String,String> infoMap = new HashMap<>() ;
        SysEmployee sysEmployee = sysEmployeeService.selectById("1");
        infoMap.put("用户信息：",sysEmployee.toString()) ;
        return infoMap ;
    }

    @RequestMapping("/insertSysEmployee")
    public Map<String,String> insertSysEmployee (){
        SysEmployee sysEmployee = new SysEmployee();
        sysEmployee.setLoginCode("asdfsdaf");
        sysEmployee.setPassword("asdfsdaf");
        sysEmployee.setServiceNumber("111111111");
        sysEmployeeService.insertParam(sysEmployee);
        Map<String,String> infoMap = new HashMap<>() ;
        infoMap.put("插入结果：","插入成功") ;
        return infoMap ;
    }
}
