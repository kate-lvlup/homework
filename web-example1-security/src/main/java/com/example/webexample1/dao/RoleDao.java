package com.example.webexample1.dao;

import com.example.webexample1.model.Role;

import java.util.Optional;

public interface RoleDao {
    Optional<Role> findRoleByName(String name);
}
