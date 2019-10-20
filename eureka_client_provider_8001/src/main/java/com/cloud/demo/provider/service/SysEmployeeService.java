package com.cloud.demo.provider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.demo.provider.entity.SysEmployee;

public interface SysEmployeeService extends IService<SysEmployee> {
    SysEmployee selectById(String employeeId) ;
    void insertParam(SysEmployee sysEmployee) ;
}
