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
public class CRUDBuku{
    public void create(int id_buku, String judul, String penulis, String penerbit, int jumlah_halaman){
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            String query = "INSERT INTO buku (id_buku, judul, penulis, penerbit, jumlah_halaman, created_at) VALUES (?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
            PreparedStatement ps = koneksi.prepareStatement(query);
            
            ps.setInt(1, id_buku);
            ps.setString(2, judul);
            ps.setString(3, penulis);
            ps.setString(4, penerbit);
            ps.setInt(5, jumlah_halaman);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data buku berhasil dimasukkan.");
            } else {
                System.out.println("Gagal memasukkan data buku.");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
    
    public void read(){
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            
            String query = "SELECT * FROM buku";
            
            Statement statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id_buku = resultSet.getInt("id_buku");
                String judul = resultSet.getString("judul");
                String penulis = resultSet.getString("penulis");
                String penerbit = resultSet.getString("penerbit");
                String jumlah_halaman = resultSet.getString("jumlah_halaman");
                
                System.out.println("ID: " + id_buku + "\nJudul Buku: " + judul + "\nPenulis: " + penulis + "\nPenerbit: " + penerbit + "\nJumlah Halaman: " + jumlah_halaman);
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

            System.out.print("Masukkan id buku yang akan diupdate: ");
            int id_buku = scanner.nextInt();
            scanner.nextLine();
            
            String checkQuery = "SELECT * FROM buku WHERE id_buku = ?";
            PreparedStatement checkStatement = koneksi.prepareStatement(checkQuery);
            checkStatement.setInt(1, id_buku);
            ResultSet resultSet = checkStatement.executeQuery();

            if (!resultSet.next()) {
                System.out.println("id buku tidak ditemukan.");
                return;
            }

            System.out.print("Masukkan judul buku baru: ");
            String judulBaru = scanner.nextLine();
            System.out.print("Masukkan penulis baru: ");
            String penulisBaru = scanner.nextLine();
            System.out.print("Masukkan penerbit baru: ");
            String penerbitBaru = scanner.nextLine();
            System.out.print("Masukkan jumlah_halaman baru: ");
            String jumlahHalamanBaru = scanner.nextLine();

            String updateQuery = "UPDATE buku SET judul = ?, penulis = ?, penerbit = ?, jumlah_halaman = ? WHERE id_buku = ?";
            PreparedStatement updateStatement = koneksi.prepareStatement(updateQuery);
            updateStatement.setString(1, judulBaru);
            updateStatement.setString(2, penulisBaru);
            updateStatement.setString(3, penerbitBaru);
            updateStatement.setString(4, jumlahHalamanBaru);
            updateStatement.setInt(5, id_buku);

            int rowsAffected = updateStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data buku berhasil diupdate.");
            } else {
                System.out.println("Gagal mengupdate data buku.");
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
            System.out.print("Masukkan id buku yang akan dihapus: ");
            int id_buku = scanner.nextInt();
            
            String checkQuery = "SELECT * FROM buku WHERE id_buku = ?";
            PreparedStatement checkStatement = koneksi.prepareStatement(checkQuery);
            checkStatement.setInt(1, id_buku);
            ResultSet resultSet = checkStatement.executeQuery();

            if (!resultSet.next()) {
                System.out.println("id buku tidak ditemukan.");
                return;
            }
            
            String deleteQuery = "DELETE FROM buku WHERE id_buku = ?";
            PreparedStatement deleteStatement = koneksi.prepareStatement(deleteQuery);
            deleteStatement.setInt(1, id_buku);

            int rowsAffected = deleteStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data buku berhasil dihapus.");
            } else {
                System.out.println("Gagal menghapus data buku.");
            }

            deleteStatement.close();
            checkStatement.close();
            resultSet.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
}
