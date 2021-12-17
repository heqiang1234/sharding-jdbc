package com.sharding.shardingjdbc.entity;

import java.util.Date;

/**
 * @author HQ
 * @program: sharding-jdbc
 * @description: 订单表
 * @date 2021-12-16 22:20:57
 */
public class Order {

    // 主键
    private Long orderid;
    // 订单编号
    private String ordernumber;
    // 用户ID
    private Long userid;
    // 产品ID
    private Long productid;
    // 创建时间
    private Date createTime;
}
