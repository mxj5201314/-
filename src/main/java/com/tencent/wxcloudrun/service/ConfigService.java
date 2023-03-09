package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.Config;
import com.tencent.wxcloudrun.model.Counter;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Optional;

/**
 * @author zhouzhao
 */
public interface ConfigService {

  Config getOnce();

}
