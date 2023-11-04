/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpusdata;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author refah
 */

public class LoginClass {
    public void input() throws SQLException{
        // Data yang diinput oleh pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        if (login(inputUsername, inputPassword)) {
            System.out.println("Login berhasil. Selamat datang!");
            // Di sini, Anda dapat melanjutkan ke langkah berikutnya dalam sistem
        } else {
            System.out.println("Username atau password salah.");
        }
    }

    public boolean login(String username, String password) throws SQLException {
        Koneksi konek = new Koneksi();
        Connection koneksi = konek.buka();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Query untuk mencari user berdasarkan username dan password
            String query = "SELECT * FROM admin WHERE username = ? AND password = ?";
            preparedStatement = koneksi.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            resultSet = preparedStatement.executeQuery();

            // Jika ada hasil, user valid
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (koneksi != null) koneksi.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
