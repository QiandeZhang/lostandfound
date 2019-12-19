package com.qf.laf.entity;

import lombok.Data;

import java.util.Date;

/**
 * 公告实体类,自由管理员允许创建公告
 */
@Data
public class Notice {
    private Integer nId;
    //公告的标题
    private String title;
    //公告的主体内容
    private String body;
    //存储图片的地址
    private String pic1;
    //存储图片的地址
    private String pic2;
    //创建时间
    private Date createTime;
}
