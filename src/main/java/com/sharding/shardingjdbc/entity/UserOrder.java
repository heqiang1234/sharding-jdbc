package com.sharding.shardingjdbc.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author HQ
 * @program: sharding-jdbc
 * @description: 用户订单
 * @date 2021-12-16 22:05:34
 */
@Data
public class UserOrder {
    // 主键
    private Long orderid;
    // 订单编号
    private String ordernumber;
    // 用户ID
    private Long userid;
    // 产品ID
    private String yearmonth;
    // 创建时间
    private Date createTime;
}
