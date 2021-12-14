package com.sharding.shardingjdbc.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author HQ
 * @program: sharding-jdbc
 * @description: 用户表
 * @date 2021-12-14 08:17:13
 */
@Data
public class User implements Serializable{
    // 主键
    private Integer id;
    // 姓名
    private String nickname;
    // 密码
    private String password;
    // 性别
    private Integer sex;
    // 生日
    private String birthday;
}
