package com.qf.laf.entity;

import lombok.Data;

@Data
public class User {
    private Integer uId;
    private String uName;
    private String uPassword;
    private String sex;
    private String phone;
    private String email;
    private String createTime;
}
