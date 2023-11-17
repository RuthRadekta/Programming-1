/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpusdata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Pengembalian {
    
    public boolean cekTransaksi(int id_transaksi) {
        boolean value = false;
        
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            String checkQuery = "SELECT * FROM status WHERE kembali IS NULL, id_transaksi = ?";
            PreparedStatement checkStatement = koneksi.prepareStatement(checkQuery);
            checkStatement.setInt(1, id_transaksi);
            ResultSet resultSet = checkStatement.executeQuery();

            if (!resultSet.next()) {
            } else {
                value = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return value;
    }
    
    public void catatPengembalian(int id_transaksi){
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            String query = "UPDATE status SET kembali = CURRENT_TIMESTAMP WHERE id_transaksi = ?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id_transaksi);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Status pengembalian berhasil dicatat.");
            } else {
                System.out.println("Gagal mencatat status pengembalian.");
            }
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
    
    public void prosedurPengembalian(int id_transaksi){
        if (cekTransaksi(id_transaksi)) {
            catatPengembalian(id_transaksi);
        } else if (!cekTransaksi(id_transaksi)) {
            System.out.println("id transaksi tidak ditemukan.");
        }
    }
}
