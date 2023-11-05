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
    public void cekAnggota(){
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
                return;
            } else {
                id_anggota = resultSet.getInt("id_anggota");
                String nama = resultSet.getString("nama");
                String jenis_kelamin = resultSet.getString("jenis_kelamin");
                String alamat = resultSet.getString("alamat");
                String email = resultSet.getString("email");
                
                System.out.println("ID: " + id_anggota + "\nNama: " + nama + "\nJenis Kelamin: " + jenis_kelamin + "\nAlamat: " + alamat + "\nEmail: " + email);
                System.out.println("Apakah data sudah sesuai? y/n:");
                String cek = scanner.nextLine();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void cekBuku(){
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
                return;
            } else {
                id_buku = resultSet.getInt("id_buku");
                String judul = resultSet.getString("judul");
                String penulis = resultSet.getString("penulis");
                String penerbit = resultSet.getString("penerbit");
                String jumlah_halaman = resultSet.getString("jumlah_halaman");
                
                System.out.println("ID: " + id_buku + "\nNama: " + judul + "\nPenulis: " + penulis + "\nPenerbit: " + penerbit + "\nJumlah Halaman: " + jumlah_halaman);
                System.out.println("Apakah data sudah sesuai? y/n:");
                String cek = scanner.nextLine();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
