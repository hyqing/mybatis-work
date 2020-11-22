package com.hyq.mybatis.plus.example;

import com.hyq.mybatis.plus.example.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by hyq on 2020/11/22 9:50.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    private UserService userService;

    @Test
    public void test() {
        String test = userService.test();
        System.out.println(test);
    }

}
