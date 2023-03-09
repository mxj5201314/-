package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Config implements Serializable {

    private Long id;

    private String value;

}
