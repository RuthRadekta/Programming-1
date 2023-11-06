/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpusdata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Date;
import java.sql.SQLException;

/**
 *
 * @author refah
 */
public class HitungDenda {
    public void hitungDenda(){
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            String query = "SELECT pinjam FROM status";
            PreparedStatement preparedStatement = koneksi.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            Date currentTime = new Date();
            while (resultSet.next()) {
                Timestamp timestamp = resultSet.getTimestamp("pinjam");
                Date pinjamDate = new Date(timestamp.getTime());
                long selisihMillis = currentTime.getTime() - pinjamDate.getTime();
                int selisihHari = (int) (selisihMillis / (1000 * 60 * 60 * 24));
                System.out.println(selisihHari);
                // Di sini Anda dapat menggunakan selisihHari untuk menghitung denda dan meng-update tabel "status" sesuai kebutuhan.
                
            }
            
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
        
    }
}
