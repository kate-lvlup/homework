package app.dao;

import app.User;

public interface UserDao {

    boolean createUser(User user);

    User findUserByUserName(String username);

    void updateUser(User user);

    User findUserById(Long id);

    boolean deleteUserById(Long id);
}
