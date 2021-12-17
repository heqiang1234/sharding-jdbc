package com.sharding.shardingjdbc.mapper;

import com.sharding.shardingjdbc.entity.UserOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author HQ
 * @create 2021/12/16 22:17
 */
@Repository
@Mapper
public interface UserOrderMapper {

    @Options(useGeneratedKeys = true, keyColumn = "orderid", keyProperty = "orderid")
    void saveUserOrder(UserOrder userOrder);

    @Select("select count(1) from user_order")
    int countOrder();
}
