package com.cloud.demo.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.demo.provider.entity.ParamInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ParamInfoMapper extends BaseMapper<ParamInfo> {
    void insertParam(ParamInfo paramInfo) ;
}
