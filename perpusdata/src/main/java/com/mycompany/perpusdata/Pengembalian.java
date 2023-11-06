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
            /*catetan = SELECT * FROM status WHERE id_transaksi = ? AND kembali IS NULL;*/
            String checkQuery = "SELECT * FROM status WHERE id_transaksi = ?";
            PreparedStatement checkStatement = koneksi.prepareStatement(checkQuery);
            checkStatement.setInt(1, id_transaksi);
            ResultSet resultSet = checkStatement.executeQuery();

            if (!resultSet.next()) {
            } else {
                /*
                id_transaksi = resultSet.getInt("id_transaksi");
                int id_anggota = resultSet.getInt("id_anggota");
                int id_buku = resultSet.getInt("id_buku");
                String pinjam = resultSet.getString("pinjam");
                String kembali = resultSet.getString("kembali");
                
                System.out.println("id transaksi: " + id_transaksi + "\nid anggota: " + id_anggota + "\nid buku" + id_buku + "\ntanggal pinjam" + pinjam + "\ntanggal kembali" + kembali);
                */
                value = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return value;
    }
    
    public boolean cekPeminjaman() {
        boolean value = false;
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            String checkQuery = "SELECT * FROM status WHERE kembali IS NULL";
            PreparedStatement checkStatement = koneksi.prepareStatement(checkQuery);

            ResultSet resultSet = checkStatement.executeQuery();

            if (!resultSet.next()) {
                System.out.println("Tidak ada transaksi peminjaman yang belum dikembalikan.");
            } else {
                while (resultSet.next()) {
                     int id_transaksi = resultSet.getInt("id_transaksi");
                     int id_anggota = resultSet.getInt("id_anggota");
                     int id_buku = resultSet.getInt("id_buku");
                     String pinjam = resultSet.getString("pinjam");
                     System.out.println("id transaksi: " + id_transaksi + "\nid anggota: " + id_anggota + "\nid buku: " + id_buku + "\ntanggal pinjam: " + pinjam);
                }
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
            /*
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan id transaksi: ");
            int id_transaksi = scanner.nextInt();
            */
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
    
    public void prosedurPengembalian(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan id transaksi: ");
        int id_transaksi = scanner.nextInt();
        if (cekTransaksi(id_transaksi)) {
            catatPengembalian(id_transaksi);
        } else if (!cekTransaksi(id_transaksi)) {
            System.out.println("id transaksi tidak ditemukan.");
        }
    }
}
