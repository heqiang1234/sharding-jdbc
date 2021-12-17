package com.sharding.shardingjdbc.service;

import com.sharding.shardingjdbc.entity.User;
import com.sharding.shardingjdbc.entity.UserOrder;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author HQ
 * @create 2021/12/16 22:14
 */
public interface UserOrderService {

    int countOrder();

    void addUserOrder(UserOrder userOrder);
}
