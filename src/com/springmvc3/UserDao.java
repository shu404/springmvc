package com.springmvc3;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public void insertUser() throws Exception{
        System.out.println("UserDao.insertUser");
    }
}
