package com.example.recipe_web_app_spring.dao;

import com.example.recipe_web_app_spring.model.User;
import com.example.recipe_web_app_spring.model.command.UserUpdateCommand;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    Optional<User> getUserById(long id);

    void saveUser(User user);

    List<User> getAllUsers();

    void deleteUserById(Long id);

    void updateUserById(Long id, UserUpdateCommand command);

    Optional<User> findUserByUserName(String s);
}

