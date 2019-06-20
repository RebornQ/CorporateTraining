package com.mallotec.reb.corporatetraining.service.impl;

import com.mallotec.reb.corporatetraining.dao.UserMapper;
import com.mallotec.reb.corporatetraining.pojo.User;
import com.mallotec.reb.corporatetraining.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByName(String name) {
        return userMapper.selectByName(name);
    }

    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }
}
