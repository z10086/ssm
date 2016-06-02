package com.z.test.service.impl;

import com.z.test.pojo.User;
import com.z.test.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

/**
 * @author zcq
 * @ClassName:
 * @Description: TODO()
 * @date 2016/6/2 16:14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Transactional
public class UserServiceImplTest {
    @Autowired
    IUserService userService;

    @Test
    public void getUserById() throws Exception {
        User user;
        user = userService.getUserById(1);

    }

    @Test
    @Rollback(true)
    public void insertUser() throws Exception {
        User user = new User();
        user.setUsername("zzz");
        user.setPassword("222");
        userService.insertUser(user);


    }

}