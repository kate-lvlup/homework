package com.example.recipe_web_app_spring.dao;

import com.example.recipe_web_app_spring.model.Role;

import java.util.Optional;

public interface RoleDao {
    Optional<Role> findRoleByName(String name);

}
