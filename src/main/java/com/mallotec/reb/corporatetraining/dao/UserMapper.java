package com.mallotec.reb.corporatetraining.dao;

import com.mallotec.reb.corporatetraining.dao.base.UserBaseMapper;
import com.mallotec.reb.corporatetraining.pojo.User;

public interface UserMapper extends UserBaseMapper {

    User selectByName(String username);
}