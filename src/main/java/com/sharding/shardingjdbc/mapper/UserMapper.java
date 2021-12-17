package com.sharding.shardingjdbc.mapper;

import com.sharding.shardingjdbc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: sharding-jdbc
 * @description: user mapper
 * @author: Mr.He
 * @create: 2021-12-14 10:04
 **/
@Mapper
@Repository
public interface UserMapper {

    List<User> getAllUser();

    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void saveUser(User user);
}
