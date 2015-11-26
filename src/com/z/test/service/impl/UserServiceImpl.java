package com.z.test.service.impl;

import com.z.test.service.IUserService;



import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.z.test.dao.IUserDao;
import com.z.test.pojo.User;


@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.getUserById(userId);
    }

}
