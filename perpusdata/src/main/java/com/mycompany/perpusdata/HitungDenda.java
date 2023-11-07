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
                int denda = 0;
                Timestamp timestamp = resultSet.getTimestamp("pinjam");
                Date pinjamDate = new Date(timestamp.getTime());
                long selisihMillis = currentTime.getTime() - pinjamDate.getTime();
                int selisihHari = (int) (selisihMillis / (1000 * 60 * 60 * 24));
                int batas = 5 - selisihHari;
                if (batas < 0) {
                    denda = batas * -1000;
                }
                String updateQuery = "UPDATE status SET denda = ? WHERE pinjam = ?";
                PreparedStatement updateStatement = koneksi.prepareStatement(updateQuery);
                updateStatement.setInt(1, denda);
                updateStatement.setTimestamp(2, timestamp);
                updateStatement.executeUpdate();
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
        
    }
}
