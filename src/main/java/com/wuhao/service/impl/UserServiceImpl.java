package com.wuhao.service.impl;

import com.wuhao.dao.UserMapper;
import com.wuhao.domain.User;
import com.wuhao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 用户接口实现类
 * @author: wuhao
 * @create: 2020-06-15 23:11
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserById(Long id) { return userMapper.queryUserById(id); }

    @Override
    public int addUser(User user) { return userMapper.addUser(user); }

    @Override
    public int modifyUser(User user) {
        return userMapper.modifyUser(user);
    }

    @Override
    public int deleteUserById(Long id) {
        return userMapper.deleteUserById(id);
    }

    @Override
    public List<User> queryAllUsers() { return userMapper.queryAllUsers(); }

}
