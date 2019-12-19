package com.qf.laf.entity;

import lombok.Data;

import java.util.Date;

@Data
public class report {
    //报告id
    private Integer rId;
    //审核本条操作的用户的管理员
    private Integer aId;
    //被举报的贴文编号id
    private Integer msgId;
    //发布该条贴文的用户
    private Integer uId;
    //被举报的次数
    private Integer total;
    //被举报的类型，属于拾物的贴文还是丢失的贴文
    private String type;
    //创建的时间
    private Date createTime;
}
