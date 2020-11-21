package com.hyq.mybatis.demo.service;

import com.hyq.mybatis.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hyq on 2020/11/21 22:14.
 */
public interface UserService {
    List<User> queryUserBySchoolName(User user);
}

