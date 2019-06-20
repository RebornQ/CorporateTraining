package com.mallotec.reb.corporatetraining.dao.base;

import com.mallotec.reb.corporatetraining.pojo.User;

public interface UserBaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByName(String username);
}