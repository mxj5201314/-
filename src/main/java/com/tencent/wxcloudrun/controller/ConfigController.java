package com.tencent.wxcloudrun.controller;


import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.Config;
import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.service.ConfigService;
import com.tencent.wxcloudrun.service.CounterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/config")
public class ConfigController {

    final ConfigService configService;
    final Logger logger;

    public ConfigController(@Autowired ConfigService configService) {
        this.configService = configService;
        this.logger = LoggerFactory.getLogger(ConfigController.class);
    }

    @GetMapping(value = "/once")
    ApiResponse get() {
        Config once = configService.getOnce();
        return ApiResponse.ok(once);
    }



}
