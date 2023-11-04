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
 * @author refah
 */
public class CRUDBuku implements CRUD{
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
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan ID anggota yang akan diupdate: ");
            int id_anggota = scanner.nextInt();
            scanner.nextLine();
            
            String checkQuery = "SELECT * FROM anggota WHERE id_anggota = ?";
            PreparedStatement checkStatement = koneksi.prepareStatement(checkQuery);
            checkStatement.setInt(1, id_anggota);
            ResultSet resultSet = checkStatement.executeQuery();

            if (!resultSet.next()) {
                System.out.println("ID anggota tidak ditemukan.");
                return;
            }

            System.out.print("Masukkan nama baru: ");
            String namaBaru = scanner.nextLine();
            System.out.print("Masukkan jenis kelamin baru: ");
            String jenisKelaminBaru = scanner.nextLine();
            System.out.print("Masukkan alamat baru: ");
            String alamatBaru = scanner.nextLine();
            System.out.print("Masukkan email baru: ");
            String emailBaru = scanner.nextLine();

            String updateQuery = "UPDATE anggota SET nama = ?, jenis_kelamin = ?, alamat = ?, email = ? WHERE id_anggota = ?";
            PreparedStatement updateStatement = koneksi.prepareStatement(updateQuery);
            updateStatement.setString(1, namaBaru);
            updateStatement.setString(2, jenisKelaminBaru);
            updateStatement.setString(3, alamatBaru);
            updateStatement.setString(4, emailBaru);
            updateStatement.setInt(5, id_anggota);

            int rowsAffected = updateStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data anggota berhasil diupdate.");
            } else {
                System.out.println("Gagal mengupdate data anggota.");
            }

            updateStatement.close();
            checkStatement.close();
            resultSet.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }

    public void delete() {
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan ID anggota yang akan dihapus: ");
            int id_anggota = scanner.nextInt();
            
            String checkQuery = "SELECT * FROM anggota WHERE id_anggota = ?";
            PreparedStatement checkStatement = koneksi.prepareStatement(checkQuery);
            checkStatement.setInt(1, id_anggota);
            ResultSet resultSet = checkStatement.executeQuery();

            if (!resultSet.next()) {
                System.out.println("ID anggota tidak ditemukan.");
                return;
            }
            
            String deleteQuery = "DELETE FROM anggota WHERE id_anggota = ?";
            PreparedStatement deleteStatement = koneksi.prepareStatement(deleteQuery);
            deleteStatement.setInt(1, id_anggota);

            int rowsAffected = deleteStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data anggota berhasil dihapus.");
            } else {
                System.out.println("Gagal menghapus data anggota.");
            }

            deleteStatement.close();
            checkStatement.close();
            resultSet.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
}
