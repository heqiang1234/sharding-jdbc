package com.sharding.shardingjdbc.controller;

import com.sharding.shardingjdbc.entity.User;
import com.sharding.shardingjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author HQ
 * @program: sharding-jdbc
 * @description: 用户操作类
 * @date 2021-12-14 08:22:45
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/listuser")
    public List<User> listUser() {
        return userService.getAllUser();
    }

    @GetMapping("/save")
    public String SaveUser(){

        User user = new User();
        user.setNickname("何" + new Random().nextInt());
        user.setPassword("123");
        user.setSex(1);
        user.setAge(new Random().nextInt(99));
        user.setBirthday(new Date());
        userService.saveUser(user);
        return "success";
    }

}
