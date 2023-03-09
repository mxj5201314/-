package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Config;
import com.tencent.wxcloudrun.model.Counter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ConfigMapper {

  Config getOnce();
}
