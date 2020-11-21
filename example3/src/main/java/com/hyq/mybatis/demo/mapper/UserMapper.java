package com.hyq.mybatis.demo.mapper;

import com.hyq.mybatis.demo.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by hyq on 2020/11/21 22:11.
 */
@Mapper
public interface UserMapper {
    List<User> queryUserBySchoolName(User user);
}

