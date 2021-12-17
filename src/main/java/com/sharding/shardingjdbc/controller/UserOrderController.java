package com.sharding.shardingjdbc.controller;

import com.sharding.shardingjdbc.entity.User;
import com.sharding.shardingjdbc.entity.UserOrder;
import com.sharding.shardingjdbc.mapper.UserOrderMapper;
import com.sharding.shardingjdbc.service.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

/**
 * @author HQ
 * @program: sharding-jdbc
 * @description: 测试
 * @date 2021-12-16 22:19:32
 */
@RestController
@RequestMapping("/userorder")
public class UserOrderController {

    @Autowired
    private UserOrderService userOrderService;

    @GetMapping("/saveuserorder")
    public String SaveUserOrder(){
        UserOrder userOrder = new UserOrder();
        userOrder.setOrderid(10000L);
        userOrder.setCreateTime(new Date());
        userOrder.setOrdernumber("133455678");
        userOrder.setYearmonth("202102");
        userOrder.setUserid(1L);
        userOrderService.addUserOrder(userOrder);
        return "success";
    }

    @GetMapping("/getcount")
    public int GetCount(){
        return userOrderService.countOrder();
    }
}
