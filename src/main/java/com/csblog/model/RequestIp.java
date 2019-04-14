package com.csblog.model;

import lombok.Data;

@Data
public class RequestIp {

    private String ip;

    private long createTime;

    private Integer reCount;

}