package com.study.database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connect {
    private static Connection conn = null;
    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                String username = "root";
                String password = "admin";

                conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/java_db",
                        username, password);
            }
        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return conn;
    }
}
