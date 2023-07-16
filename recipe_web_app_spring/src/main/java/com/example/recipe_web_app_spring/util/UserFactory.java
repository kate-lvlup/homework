package com.example.recipe_web_app_spring.util;

import com.example.recipe_web_app_spring.model.Role;
import com.example.recipe_web_app_spring.model.SecurityUser;
import com.example.recipe_web_app_spring.model.User;
import com.example.recipe_web_app_spring.model.command.UserCommand;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserFactory {
    public static SecurityUser toSecurityUser(User user) {
        return new SecurityUser(
                user.getUsername(),
                user.getPassword(),
                getAuthoritiesFromRoles(user.getRoles()),
                user.getId());
    }

    public static List<GrantedAuthority> getAuthoritiesFromRoles(List<Role> roles) {
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
    }


    public static UserCommand userToCommand(User user) {
        return UserCommand.builder()
                .id(user.getId())
                .username(user.getUsername())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
                .date(user.getDate())
                .address(user.getAddress())
                .build();
    }
    public static List<UserCommand> usersToCommand(List<User> users) {
        List<UserCommand> usersCommandList = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            UserCommand command = userToCommand(users.get(i));
            command.setNumber(1 + i);
            usersCommandList.add(command);
        }
        return usersCommandList;
    }
}

