package com.sharding.shardingjdbc;

import com.sharding.shardingjdbc.entity.User;
import com.sharding.shardingjdbc.entity.UserOrder;
import com.sharding.shardingjdbc.service.UserOrderService;
import com.sharding.shardingjdbc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@SpringBootTest
class ShardingJdbcApplicationTests {

    @Autowired
    private UserService userService;

    @Autowired
    private UserOrderService userOrderService;

    @Test
    void contextLoads() {
        User user = new User();
        user.setNickname("何" + new Random().nextInt());
        user.setPassword("123");
        user.setSex(1);
        user.setAge(2);
        user.setBirthday(new Date());
        userService.saveUser(user);
       //return "success";
    }

    @Test
    public void testTransction(){
        User user = new User();
        user.setNickname("zhangsan" + new Random().nextInt());
        user.setPassword("12345");
        user.setSex(1);
        user.setAge(3);
        user.setBirthday(new Date());

        UserOrder userOrder = new UserOrder();
       // userOrder.setOrderid(10000L);
        System.out.println(new Date());
        //userOrder.setCreateTime(new Date());
        userOrder.setOrdernumber("133455678");
        userOrder.setYearmonth("202102");
        userOrder.setUserid(1L);
        userOrderService.saveUserOrderTran(user,userOrder);
    }

    @Test
    public void SaveUserOrder(){
        UserOrder userOrder = new UserOrder();
        userOrder.setOrderid(10000L);
        userOrder.setCreateTime(new Date());
        userOrder.setOrdernumber("133455678");
        userOrder.setYearmonth("202102");
        userOrder.setUserid(1L);
        userOrderService.addUserOrder(userOrder);
        //return "success";
    }

}
