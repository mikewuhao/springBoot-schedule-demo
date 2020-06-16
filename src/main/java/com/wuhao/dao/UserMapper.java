package com.wuhao.dao;

import com.wuhao.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description: dao接口类
 * @author: wuhao
 * @create: 2020-06-15 23:11
 **/
@Mapper
@Repository
public interface UserMapper {

    User queryUserById(Long id);

    int addUser(User user);

    int modifyUser(User user);

    int deleteUserById(Long id);

    List<User> queryAllUsers();

}
