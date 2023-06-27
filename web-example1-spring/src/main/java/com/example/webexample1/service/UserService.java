package com.example.webexample1.service;

import com.example.webexample1.dao.UserDao;
import com.example.webexample1.model.User;
import com.example.webexample1.model.command.UserUpdateCommand;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }


    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    public void deleteUserById(Long id) {
        userDao.deleteUserById(id);
    }

    public void updateUserById(Long id, UserUpdateCommand command) {
        userDao.updateUserById(id, command);
    }
}
