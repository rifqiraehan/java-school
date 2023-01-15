package com.study.database.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Date;

public class select {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String username = "root";
            String password = "admin";

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java_db", username, password);

            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM siswa";
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                String nis = result.getString("nis");
                String nama = result.getString("nama");
                String tglLahir = result.getString("tglLahir");
                String alamat = result.getString("alamat");
                String namaOrtu = result.getString("namaOrtu");
                System.out.println("NIS                : " + nis);
                System.out.println("Nama               : " + nama);
                System.out.println("Tanggal Lahir      : " + tglLahir);
                System.out.println("Alamat             : " + alamat);
                System.out.println("Nama Orang Tua     : " + namaOrtu);
                System.out.println("===================================");
            }
        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
        }
    }
}