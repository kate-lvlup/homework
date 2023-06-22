package com.example.webexample1.dao;

import com.example.webexample1.model.User;
import com.example.webexample1.model.command.UserUpdateCommand;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    Optional<User>  getUserById(long id);

    void saveUser(User user);
    List<User> getAllUsers();

    void deleteUserById(Long id);

    void updateUserById(Long id, UserUpdateCommand command);
}
