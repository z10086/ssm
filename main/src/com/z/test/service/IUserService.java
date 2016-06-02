package com.z.test.service;


import com.z.test.pojo.User;

public interface IUserService {
    public User getUserById(int userId);

    public User getTopUser();

    public void insertUser(User user);
}
