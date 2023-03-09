package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.ConfigMapper;
import com.tencent.wxcloudrun.dao.CountersMapper;
import com.tencent.wxcloudrun.model.Config;
import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.service.ConfigService;
import com.tencent.wxcloudrun.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Optional;

@Service
public class ConfigServiceImpl implements ConfigService {

  @Autowired
  private ConfigMapper configMapper;

  @Override
  public Config getOnce() {
    Config once = configMapper.getOnce();
    if (once!=null&& !StringUtils.isEmpty(once.getValue())){
      once.setValue(once.getValue().replace("\n","").replace("\t",""));
    }
    return once;
  }
}
