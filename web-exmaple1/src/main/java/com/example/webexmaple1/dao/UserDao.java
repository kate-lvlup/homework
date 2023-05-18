package com.example.webexmaple1.dao;

import com.example.webexmaple1.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void deleteUserById(Long id);
}
