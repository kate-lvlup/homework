package com.example.webexample1.service;

import com.example.webexample1.dao.UserDao;
import com.example.webexample1.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }


    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }

}
