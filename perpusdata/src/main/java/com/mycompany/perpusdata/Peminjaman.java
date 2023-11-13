/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpusdata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.SQLException;
/**
 *
 * @author refah
 */
public class Peminjaman {
    public boolean cekAnggota(int id_anggota){
        boolean value = false;
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            
            String checkQuery = "SELECT * FROM anggota WHERE id_anggota = ?";
            PreparedStatement checkStatement = koneksi.prepareStatement(checkQuery);
            checkStatement.setInt(1, id_anggota);
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
    
    public boolean cekBuku(int id_buku){
        boolean value = false;
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            
            String checkQuery = "SELECT * FROM buku WHERE id_buku = ?";
            PreparedStatement checkStatement = koneksi.prepareStatement(checkQuery);
            checkStatement.setInt(1, id_buku);
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
    
    public void catatPeminjaman(int id_transaksi, int id_anggota, int id_buku){
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            String query = "INSERT INTO status (id_transaksi, id_anggota, id_buku, pinjam, denda) VALUES (?, ?, ?, CURRENT_TIMESTAMP, null)";
            PreparedStatement ps = koneksi.prepareStatement(query);
            
            ps.setInt(1, id_transaksi);
            ps.setInt(2, id_anggota);
            ps.setInt(3, id_buku);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Status peminjaman berhasil dimasukkan.");
            } else {
                System.out.println("Gagal memasukkan status peminjaman.");
            }

        } catch(SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
    
    public void prosedurPeminjaman(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan id transaksi baru: ");
        int id_transaksi = scanner.nextInt();
        System.out.print("Masukkan id anggota yang meminjam: ");
        int id_anggota = scanner.nextInt();
        System.out.print("Masukkan id buku yang dipinjam: ");
        int id_buku = scanner.nextInt();
        if (cekAnggota(id_anggota) && cekBuku(id_buku)) {
            catatPeminjaman(id_transaksi, id_anggota, id_buku);
        } else if (!cekAnggota(id_anggota)) {
            System.out.println("id anggota tidak ditemukan.");
        } else if (!cekBuku(id_buku)) {
            System.out.println("id buku tidak ditemukan.");
        }
    }
    
    public void cekTenggat(){
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
}
