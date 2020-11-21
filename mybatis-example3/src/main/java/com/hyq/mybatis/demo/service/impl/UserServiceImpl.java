package com.hyq.mybatis.demo.service.impl;

import com.hyq.mybatis.demo.mapper.UserMapper;
import com.hyq.mybatis.demo.model.User;
import com.hyq.mybatis.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hyq on 2020/11/21 22:14.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserBySchoolName(User user) {
        return userMapper.queryUserBySchoolName(user);
    }
}
