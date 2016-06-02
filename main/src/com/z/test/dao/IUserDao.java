package com.z.test.dao;

import com.z.test.pojo.User;


public interface IUserDao {
    User getUserById(int a);

    User getTopUser();

    void insertUser(User user);
}
