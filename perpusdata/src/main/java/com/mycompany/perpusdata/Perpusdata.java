/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perpusdata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class Perpusdata {

    public static void main(String[] args) throws SQLException {
        System.out.println("Hello Dita!");
        
        Koneksi konek = new Koneksi();
        Connection koneksi = konek.buka();
        
        try {
            String query = "INSERT INTO anggota (id_anggota, nama, jenis_kelamin, alamat, email, created_at) VALUES (?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, "002");
            ps.setString(2, "Ruth Dita");
            ps.setString(3, "Perempuan");
            ps.setString(4, "Solo");
            ps.setString(5, "ruthdita@gmail.com");

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data berhasil dimasukkan ke dalam tabel.");
            } else {
                System.out.println("Gagal memasukkan data ke dalam tabel.");
            }

        } catch (SQLException ex) {
        System.out.println(ex.getMessage());  
        }
    }
}
