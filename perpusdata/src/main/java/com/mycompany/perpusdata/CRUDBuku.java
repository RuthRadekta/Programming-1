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
import javax.swing.table.DefaultTableModel;

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
    
    public DefaultTableModel read(){
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID Buku");
        tableModel.addColumn("Judul");
        tableModel.addColumn("Penulis");
        tableModel.addColumn("Penerbit");
        tableModel.addColumn("Jumlah Halaman");
        tableModel.addColumn("Created at");
        tableModel.addColumn("Updated at");
        
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            
            String query = "SELECT * FROM buku";
            
            Statement statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Object[] rowData = {
                        resultSet.getInt("id_buku"),
                        resultSet.getString("judul"),
                        resultSet.getString("penulis"),
                        resultSet.getString("penerbit"),
                        resultSet.getString("jumlah_halaman"),
                        resultSet.getString("created_at"),
                        resultSet.getString("updated_at")
                };
                tableModel.addRow(rowData);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return tableModel;
    }

    public void update(int id_bukuBaru, String judulBaru, String penulisBaru, String penerbitBaru, String jumlah_halamanBaru) {
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            
            String updateQuery = "UPDATE buku SET judul = ?, penulis = ?, penerbit = ?, jumlah_halaman = ? WHERE id_buku = ?";
            PreparedStatement updateStatement = koneksi.prepareStatement(updateQuery);
            updateStatement.setString(1, judulBaru);
            updateStatement.setString(2, penulisBaru);
            updateStatement.setString(3, penerbitBaru);
            updateStatement.setString(4, jumlah_halamanBaru);
            updateStatement.setInt(5, id_bukuBaru);

            int rowsAffected = updateStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data buku berhasil diupdate.");
            } else {
                System.out.println("Gagal mengupdate data buku.");
            }

            updateStatement.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }

    public void delete(int id_buku) {
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            
            /*String checkQuery = "SELECT * FROM buku WHERE id_buku = ?";
            PreparedStatement checkStatement = koneksi.prepareStatement(checkQuery);
            checkStatement.setInt(1, id_buku);
            ResultSet resultSet = checkStatement.executeQuery();

            if (!resultSet.next()) {
                System.out.println("id buku tidak ditemukan.");
                return;
            }*/
            
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
            /*checkStatement.close();
            resultSet.close();*/
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
    
    //buat update buku
    public boolean idb(int id_buku) throws SQLException {
        Koneksi konek = new Koneksi();
        Connection koneksi = konek.buka();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT * FROM buku WHERE id_buku = ?";
            preparedStatement = koneksi.prepareStatement(query);
            preparedStatement.setInt(1, id_buku);

            resultSet = preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    //buat delete buku
    public boolean idb2(int id_buku) throws SQLException {
        Koneksi konek = new Koneksi();
        Connection koneksi = konek.buka();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT * FROM buku WHERE id_buku = ?";
            preparedStatement = koneksi.prepareStatement(query);
            preparedStatement.setInt(1, id_buku);

            resultSet = preparedStatement.executeQuery();

            return resultSet.next();
            
            //belum disuruh delete
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
