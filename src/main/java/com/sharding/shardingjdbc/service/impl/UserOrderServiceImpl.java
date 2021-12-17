package com.sharding.shardingjdbc.service.impl;

import com.sharding.shardingjdbc.entity.UserOrder;
import com.sharding.shardingjdbc.mapper.UserOrderMapper;
import com.sharding.shardingjdbc.service.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public int countOrder() {
        return userOrderMapper.countOrder();
    }

    @Override
    public void addUserOrder(UserOrder userOrder) {
        userOrderMapper.saveUserOrder(userOrder);
    }
}
