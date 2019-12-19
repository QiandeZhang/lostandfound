package com.qf.laf.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Lost {
    private Integer lMsgId;
    private String lProvince;
    private String lCity;
    private String lAddress;
    private Date lTime;
    private String title;
    private String type;
    private Date expiration;
    private String describe;
    private String pic1;
    private String pic2;
    private String contact;
    private String lPhone;
    private String lEmail;
    private Integer uId;
    private Integer verifyStatus;
    private Date createTime;
    private Date modifyTime;
}
