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
 * @author ACER
 */
public class Pengembalian {
    public boolean cekPeminjaman(int id_transaksi) {
        boolean value = false;
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            String checkQuery = "SELECT * FROM status WHERE id_transaksi = ?";
            PreparedStatement checkStatement = koneksi.prepareStatement(checkQuery);
            checkStatement.setInt(1, id_transaksi);
            ResultSet resultSet = checkStatement.executeQuery();

            if (!resultSet.next()) {
                System.out.println("transaksi peminjaman tidak ditemukan.");
            } else {
                value = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return value;
    }
    
    public void catatPengembalian(boolean finalValue){
        
    }
}
