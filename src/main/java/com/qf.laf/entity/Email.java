package com.qf.laf.entity;

import lombok.Data;

@Data
public class Email {
    private Integer eId;
    //收取邮件的地址,eg:***@qq.com
    private String eAddress;
    //发送出去的消息
    private String body;
    //创建的时间
    private String createTime;
}
