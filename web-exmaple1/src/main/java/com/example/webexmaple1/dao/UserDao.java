package com.example.webexmaple1.dao;

import com.example.webexmaple1.model.User;
import com.example.webexmaple1.model.command.UserUpdateCommand;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    Optional<User> getUserById(long id);

    void createUser(User user);

    List<User> getAllUsers();

    void deleteUserById(Long id);

    void updateUserById(Long id, UserUpdateCommand command);
}