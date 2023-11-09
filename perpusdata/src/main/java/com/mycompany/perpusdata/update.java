/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpusdata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class update {
    public boolean ida(String id_anggota) throws SQLException {
        Koneksi konek = new Koneksi();
        Connection koneksi = konek.buka();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT * FROM anggota WHERE id_anggota = ?";
            preparedStatement = koneksi.prepareStatement(query);
            preparedStatement.setString(1, id_anggota);

            resultSet = preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean idb(String id_buku) throws SQLException {
        Koneksi konek = new Koneksi();
        Connection koneksi = konek.buka();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT * FROM buku WHERE id_buku = ?";
            preparedStatement = koneksi.prepareStatement(query);
            preparedStatement.setString(1, id_buku);

            resultSet = preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
