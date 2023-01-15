package com.study.database.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class update {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String username = "root";
            String password = "admin";

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java_db", username, password
            );

            Statement stmt = conn.createStatement();
                String query = "UPDATE `siswa` SET `nama` = 'Jojo' WHERE (`nis` = '05005')";
            stmt.executeUpdate(query);

        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
        }
    }
}
