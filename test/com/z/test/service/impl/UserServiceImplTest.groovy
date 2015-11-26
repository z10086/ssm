package com.z.test.service.impl

import com.z.test.pojo.User
import com.z.test.service.IUserService
import org.junit.Test
import org.springframework.context.support.ClassPathXmlApplicationContext

/**
 * Created by Administrator on 2015/11/24.
 */
class UserServiceImplTest extends GroovyTestCase {
    @Test
    void testGetUserById() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //UserServiceImpl a = new UserServiceImpl();
        IUserService a = (UserServiceImpl)context.getBean("userService");
        User b = a.getUserById(1);
        System.out.println(b.getUsername());
    }
}
