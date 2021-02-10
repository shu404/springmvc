package com.springmvc3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{
    @Autowired
    private UserDao userDao;

    public void saveUser()throws Exception{
        userDao.insertUser();
    }
}
