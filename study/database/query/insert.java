package com.study.database.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insert {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String username = "root";
            String password = "admin";
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java_db",
                    username, password);

            Statement stmt = conn.createStatement();
                String query = "INSERT INTO `java_db`.`siswa` (`nis`, `nama`, `tglLahir`, `alamat`, `namaOrtu`) VALUES ('01001', 'Jonathan Joestar', '1925-04-28', 'Jl. Street', 'George Joestar'), ('02002', 'Elizabeth Joestar', '1945-01-21', 'Jl. Jalan', 'Jonathan Joestar'),('03003', 'Joseph joestar', '1975-02-02', 'Jl. Way', 'Elizabeth Joestar'), ('04004', 'Josuke Higashikata', '1990-03-03', 'Jl. Buntu', 'Joseph Joestar'), ('05005', 'Jolyne Kujo', '2005-04-04', 'Jl. No Way', 'Jotaro Kujo');";
            stmt.executeUpdate(query);

        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
        }
    }
}
