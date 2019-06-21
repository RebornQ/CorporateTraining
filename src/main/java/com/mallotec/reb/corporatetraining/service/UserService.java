package com.mallotec.reb.corporatetraining.service;

import com.mallotec.reb.corporatetraining.pojo.User;

public interface UserService {

    User findUserByName(String name);

    int addUser(User user);
}
