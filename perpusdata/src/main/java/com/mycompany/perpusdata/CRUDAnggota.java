/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpusdata;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author refah
 */
public class CRUDAnggota implements CRUD{
    public void create(){
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            String query = "INSERT INTO anggota (id_anggota, nama, jenis_kelamin, alamat, email, created_at) VALUES (?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
            PreparedStatement ps = koneksi.prepareStatement(query);
            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan id anggota: ");
            int id_anggota = scanner.nextInt();
            System.out.print("Masukkan nama: ");
            scanner.nextLine();
            String nama = scanner.nextLine();
            System.out.print("Masukkan jenis kelamin: ");
            String jenis_kelamin = scanner.nextLine();
            System.out.print("Masukkan alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("Masukkan email: ");
            String email = scanner.nextLine();
            
            ps.setInt(1, id_anggota);
            ps.setString(2, nama);
            ps.setString(3, jenis_kelamin);
            ps.setString(4, alamat);
            ps.setString(5, email);

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
    
    public void read(){
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            
            String query = "SELECT * FROM anggota";
            
            Statement statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id_anggota = resultSet.getInt("id_anggota");
                String nama = resultSet.getString("nama");
                String jenis_kelamin = resultSet.getString("jenis_kelamin");
                String alamat = resultSet.getString("alamat");
                String email = resultSet.getString("email");
                
                System.out.println("ID: " + id_anggota + "\nNama: " + nama + "\nJenis Kelamin: " + jenis_kelamin + "\nAlamat: " + alamat + "\nEmail: " + email);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }

    public void update() {
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }

    public void delete() {
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
}
