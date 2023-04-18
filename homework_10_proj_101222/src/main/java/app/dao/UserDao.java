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
            return pstmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
