package com.study.database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class objectStatement {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String username = "root";
            String password = "admin";

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java_db",
                    username, password);
            Statement stmt = conn.createStatement();
            System.out.println("Statement Success");
        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
        }
    }
}