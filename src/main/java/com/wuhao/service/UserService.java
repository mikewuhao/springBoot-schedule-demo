package com.wuhao.service;

import com.wuhao.domain.User;

import java.util.List;

/**
 * @description: 用户接口
 * @author: wuhao
 * @create: 2020-06-15 23:11
 **/
public interface UserService {

    User queryUserById(Long id);

    int addUser(User user);

    int modifyUser(User user);

    int deleteUserById(Long id);

    List<User> queryAllUsers();

}
