package com.hyq.mybatis.demo.controller;

import com.hyq.mybatis.demo.model.User;
import com.hyq.mybatis.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hyq on 2020/11/21 22:08.
 */
@RestController
public class TestController {
    private final Logger logger = LoggerFactory.getLogger(getClass());


    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    @RequestMapping("/userQuery")
    public String userQuery() {
        User query = new User();
        query.setSchoolName("Sunny School");
        List<User> userList = userService.queryUserBySchoolName(query);
        for (User user : userList) {
            System.out.println("name : " + user.getName() + " ;  email : " + user.getEmail());
        }
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        return "suc";
    }
}
