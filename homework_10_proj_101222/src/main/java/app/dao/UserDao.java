package app.dao;

import app.User;
import app.util.DbUtils;

import java.sql.*;

public class UserDao {

    public boolean createUser(User user) {
        try (Connection connection = DbUtils.getConnection()) {
            String sql = """
                    INSERT INTO reg_app_db.public.users(username, password, first_name, last_name, birth_date, email, phone_number)
                    VALUES (?, ?, ?, ?, ?, ?, ?)
                    ;""";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getFirstName());
            pstmt.setString(4, user.getLastName());
            pstmt.setDate(5, Date.valueOf(user.getDate()));
            pstmt.setString(6, user.getEmail());
            pstmt.setString(7, user.getPhoneNumber());
            int row = pstmt.executeUpdate();
            return row == 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public User findUserByUserName(String username) {
        try (Connection connection = DbUtils.getConnection()) {
            String sql = """
                    SELECT * FROM reg_app_db.public.users
                    WHERE username=?
                    ;""";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, username);
            ResultSet resultSet = pstmt.executeQuery();
            if (!resultSet.next()) {
                return null;
            } else {
                User user = new User();
                user.setUsername(resultSet.getString("username"));
                user.setFirstName(resultSet.getString("first_name"));
                user.setLastName(resultSet.getString("last_name"));
                user.setDate(resultSet.getDate("birth_date").toLocalDate());
                user.setPhoneNumber(resultSet.getString("phone_number"));
                return user;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateUser(User user) {
        try (Connection connection = DbUtils.getConnection()) {
            String sql = """
                    UPDATE reg_app_db.public.users
                    SET first_name=?,last_name=?,birth_date=?,email=?,phone_number=?
                    WHERE username=?
                    ;""";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, user.getFirstName());
            pstmt.setString(2, user.getLastName());
            pstmt.setDate(3, Date.valueOf(user.getDate()));
            pstmt.setString(4, user.getEmail());
            pstmt.setString(5, user.getPhoneNumber());
            pstmt.setString(6, user.getUsername());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
