package com.sharding.shardingjdbc.service.impl;

import com.sharding.shardingjdbc.entity.User;
import com.sharding.shardingjdbc.mapper.UserMapper;
import com.sharding.shardingjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: sharding-jdbc
 * @description: 用户表操作 服务层
 * @author: Mr.He
 * @create: 2021-12-14 09:58
 **/
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public void saveUser(User user) {
         userMapper.saveUser(user);
    }
}
