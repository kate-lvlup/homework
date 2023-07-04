package com.example.webexample1.service;

import com.example.webexample1.dao.UserDao;
import com.example.webexample1.exeption.UserNotFoundException;
import com.example.webexample1.model.SecurityUser;
import com.example.webexample1.model.User;
import com.example.webexample1.model.command.UserUpdateCommand;
import com.example.webexample1.util.UserFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {
    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getUserById(Long id) {
        return userDao.getUserById(id)
                .orElseThrow(() -> new UserNotFoundException("User with id: " + id + " hasn't been found"));
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

//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        Optional<User> user = userDao.findUserByUserName(s);
//        SecurityUser securityUser = UserFactory.toSecurityUser(user.get());
//        return securityUser;
//    }

    //    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findUserByUserName(username)
                .orElseThrow(() -> new UsernameNotFoundException("User with name: " + username + " hasn't been found"));
        SecurityUser securityUser = UserFactory.toSecurityUser(user);
        return securityUser;
    }
}
