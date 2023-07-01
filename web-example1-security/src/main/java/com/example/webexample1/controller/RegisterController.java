package com.example.webexample1.controller;

import com.example.webexample1.dao.RoleDao;
import com.example.webexample1.model.Role;
import com.example.webexample1.model.User;
import com.example.webexample1.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/register")
public class RegisterController {
    private final UserService userService;
    private final RoleDao roleDao;

    private final PasswordEncoder passwordEncoder;

    public RegisterController(UserService userService, RoleDao roleDao, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.roleDao = roleDao;
        this.passwordEncoder = passwordEncoder;
    }
//    public RegisterController(UserService userService, RoleDao roleDao) {
//        this.userService = userService;
//        this.roleDao = roleDao;
//    }

    @GetMapping
    public String showPage() {
        return "register";
    }

    @PostMapping
    public String register(@ModelAttribute("user") User user) {
        Optional<Role> role = roleDao.findRoleByName("USER");
        user.setRoles(List.of(role.get()));

        //Encode the password before saving
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
//        user.setPassword(user.getPassword());
        userService.saveUser(user);
        return "redirect:login";
    }
}
