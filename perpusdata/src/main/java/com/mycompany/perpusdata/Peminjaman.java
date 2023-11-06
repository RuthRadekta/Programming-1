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
    public boolean cekAnggota(){
        boolean value = false;
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Masukkan id anggota yang meminjam: ");
            int id_anggota = scanner.nextInt();
            String checkQuery = "SELECT * FROM anggota WHERE id_anggota = ?";
            PreparedStatement checkStatement = koneksi.prepareStatement(checkQuery);
            checkStatement.setInt(1, id_anggota);
            ResultSet resultSet = checkStatement.executeQuery();

            if (!resultSet.next()) {
                System.out.println("id anggota tidak ditemukan.");
            } else {
                /*
                id_anggota = resultSet.getInt("id_anggota");
                String nama = resultSet.getString("nama");
                String jenis_kelamin = resultSet.getString("jenis_kelamin");
                String alamat = resultSet.getString("alamat");
                String email = resultSet.getString("email");
                
                System.out.println("ID: " + id_anggota + "\nNama: " + nama + "\nJenis Kelamin: " + jenis_kelamin + "\nAlamat: " + alamat + "\nEmail: " + email);
                System.out.println("Apakah data sudah sesuai? y/n:");
                String cek = scanner.nextLine();
                */
                value = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return value;
    }
    
    public boolean cekBuku(){
        boolean value = false;
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Masukkan id buku yang dipinjam: ");
            int id_buku = scanner.nextInt();
            String checkQuery = "SELECT * FROM buku WHERE id_buku = ?";
            PreparedStatement checkStatement = koneksi.prepareStatement(checkQuery);
            checkStatement.setInt(1, id_buku);
            ResultSet resultSet = checkStatement.executeQuery();

            if (!resultSet.next()) {
                System.out.println("id buku tidak ditemukan.");
            } else {
                /*
                id_buku = resultSet.getInt("id_buku");
                String judul = resultSet.getString("judul");
                String penulis = resultSet.getString("penulis");
                String penerbit = resultSet.getString("penerbit");
                String jumlah_halaman = resultSet.getString("jumlah_halaman");
                
                System.out.println("ID: " + id_buku + "\nJudul: " + judul + "\nPenulis: " + penulis + "\nPenerbit: " + penerbit + "\nJumlah Halaman: " + jumlah_halaman);
                System.out.println("Apakah data sudah sesuai? y/n:");
                String cek = scanner.nextLine();
                */
                value = true;
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return value;
    }
    
    public void catatPeminjaman(boolean finalValue){
        if (finalValue == true) {
            try {
                Koneksi konek = new Koneksi();
                Connection koneksi = konek.buka();
                String query = "INSERT INTO status (id_transaksi, id_anggota, id_buku, pinjam, kembali, denda) VALUES (?, ?, ?, CURRENT_TIMESTAMP, null, null)";
                PreparedStatement ps = koneksi.prepareStatement(query);

                Scanner scanner = new Scanner(System.in);
                System.out.print("Masukkan id transaksi: ");
                int id_transaksi = scanner.nextInt();
                System.out.print("Masukkan id anggota: ");
                int id_anggota = scanner.nextInt();
                System.out.print("Masukkan id buku: ");
                int id_buku = scanner.nextInt();

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
        } else {
            System.out.println("Ada kesalahan");
        }
    }
}
