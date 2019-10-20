package com.cloud.demo.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.demo.provider.entity.SysEmployee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysEmployeeMapper extends BaseMapper<SysEmployee> {
    void insertSysEmployee(SysEmployee sysEmployee) ;
}
