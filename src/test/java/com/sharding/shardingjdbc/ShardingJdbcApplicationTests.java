package com.sharding.shardingjdbc;

import com.sharding.shardingjdbc.entity.User;
import com.sharding.shardingjdbc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.Random;

@SpringBootTest
class ShardingJdbcApplicationTests {

    @Autowired
    private UserService userService;

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

}
