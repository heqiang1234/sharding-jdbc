package com.sharding.shardingjdbc.service;

import com.sharding.shardingjdbc.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    void saveUser(User user);
}
