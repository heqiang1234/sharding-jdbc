package com.sharding.shardingjdbc.service.impl;

import com.sharding.shardingjdbc.entity.User;
import com.sharding.shardingjdbc.entity.UserOrder;
import com.sharding.shardingjdbc.mapper.UserMapper;
import com.sharding.shardingjdbc.mapper.UserOrderMapper;
import com.sharding.shardingjdbc.service.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author HQ
 * @program: sharding-jdbc
 * @description: 初试
 * @date 2021-12-16 22:15:52
 */
@Service("userOrderService")
public class UserOrderServiceImpl implements UserOrderService {

    @Autowired
    private UserOrderMapper userOrderMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public int countOrder() {
        return userOrderMapper.countOrder();
    }

    @Override
    public void addUserOrder(UserOrder userOrder) {
        userOrderMapper.saveUserOrder(userOrder);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int saveUserOrderTran(User user, UserOrder userOrder) {
        userMapper.saveUser(user);
        //userOrder.setUserid(user.getId());

        int i = 1/0;
//
//
        userOrderMapper.saveUserOrder(userOrder);
        return 1;
    }
}
