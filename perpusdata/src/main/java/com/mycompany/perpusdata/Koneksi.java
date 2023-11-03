/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpusdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author refah
 */
public class Koneksi {
    private String url = "jdbc:mysql://localhost:3306/perpustakaan";
    private String username = "root";
    private String password = "";
    Connection koneksi = null;
    
    public Connection buka() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());  
        }
        return koneksi;
    }

    public void tutup() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection(url, username, password);
            koneksi.close();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());  
        }
    }
}
