package org.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "Ph";

        Connection conn = DriverManager.getConnection(url, user, password);

        String sql = """
                CREATE TABLE reg_app.user
                (
                user_id      bigint GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
                first_name    varchar(255) NOT NULL,
                last_name     varchar(255) NOT NULL,
                email        varchar(255) NOT NULL,
                hire_date     date,
                salary int,
                job_title      varchar,
                department_name varchar
                );""";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.execute();
        conn.close();
    }
}
