package com.study.database.query;

import java.sql.*;

import com.study.database.connection.connect;

public class crud {
    public static void insertData(String nis, String nama, Date tglLahir, String alamat, String namaOrtu) {
        Connection conn = connect.getConnection();

        try {
            String query = "insert into java_db.siswa (nis, nama, tglLahir, alamat, namaOrtu) values (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, nis);
            stmt.setString(2, nama);
            stmt.setDate(3, tglLahir);
            stmt.setString(4, alamat);
            stmt.setString(5, namaOrtu);

            stmt.executeUpdate();

            System.out.println("Insert Success");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateData(String nis, String nama, Date tglLahir, String alamat, String namaOrtu) {
        Connection conn = connect.getConnection();

        try {
            String query = "update java_db.siswa set nama = ?, tglLahir = ?, alamat = ?, namaOrtu = ? where nis = ?";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, nama);
            stmt.setDate(2, tglLahir);
            stmt.setString(3, alamat);
            stmt.setString(4, namaOrtu);
            stmt.setString(5, nis);

            stmt.executeUpdate();

            System.out.println("Update Success");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteData(String nis) {
        Connection conn = connect.getConnection();

        try {
            String query = "delete from java_db.siswa where nis = ?";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, nis);

            stmt.executeUpdate();

            System.out.println("Delete Success");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selectData(String nis) {
        Connection conn = connect.getConnection();

        try {
            String query = "select * from java_db.siswa where nis = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, nis);

            ResultSet ok = stmt.executeQuery();

            while (ok.next()) {
                System.out.println("NIS       : " + ok.getString("nis"));
                System.out.println("Nama      : " + ok.getString("nama"));
                System.out.println("DOB       : " + ok.getDate("tglLahir"));
                System.out.println("Alamat    : " + ok.getString("alamat"));
                System.out.println("Nama Ortu : " + ok.getString("namaOrtu"));
                System.out.println("---------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        crud.insertData("05005", "Jojo", Date.valueOf("2005-05-05"), "Jl. Jalan", "Bapak Jojo");
        // crud.updateData("05005", "John Doe", Date.valueOf("2005-05-05"), "Jl. Meraki", "Jane Doe");
        // crud.deleteData("05005");
        // crud.selectData("05005");
    }
}



