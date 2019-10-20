package com.cloud.demo.provider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.demo.provider.entity.ParamInfo;

public interface ParamInfoService extends IService<ParamInfo> {
    ParamInfo selectById(String paramId) ;
    void insertParam(ParamInfo paramInfo) ;
}
