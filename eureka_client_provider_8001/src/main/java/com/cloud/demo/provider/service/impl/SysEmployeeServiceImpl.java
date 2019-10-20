package com.cloud.demo.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.demo.provider.entity.SysEmployee;
import com.cloud.demo.provider.mapper.SysEmployeeMapper;
import com.cloud.demo.provider.service.SysEmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("sysEmployeeService")
public class SysEmployeeServiceImpl extends ServiceImpl<SysEmployeeMapper,SysEmployee> implements SysEmployeeService {
    private static final Logger LOGGER = LoggerFactory.getLogger(SysEmployeeServiceImpl.class) ;

    @Resource
    private SysEmployeeMapper sysEmployeeMapper ;

    @Override
    public SysEmployee selectById (String employeeId){
        SysEmployee sysEmployee = sysEmployeeMapper.selectById(employeeId) ;
        LOGGER.info("SysEmployeeServiceImpl-Sign：{}",sysEmployee.getEmployeeName());
        return sysEmployee ;
    }

    @Override
    public void insertParam(SysEmployee sysEmployee) {
        sysEmployeeMapper.insertSysEmployee(sysEmployee) ;
    }

}
