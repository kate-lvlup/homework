package com.example.webexample1.util;

import com.example.webexample1.model.Role;
import com.example.webexample1.model.SecurityUser;
import com.example.webexample1.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.stream.Collectors;

public class UserFactory {
    public static SecurityUser toSecurityUser(User user) {
        return new SecurityUser(
                user.getUsername(),
                user.getPassword(),
                getAuthoritiesFromRoles(user.getRoles())
        );
    }

    public static List<GrantedAuthority> getAuthoritiesFromRoles(List<Role> roles) {
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
    }
}
