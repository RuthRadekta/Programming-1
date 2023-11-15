/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpusdata;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author refah
 */
public class IDGenerator {
    
    private static final int FIRST_DIGIT = 3;
    private static final int NUM_DIGITS = 3;

    public int idGenerator() {
        int id_transaksi = 0;

        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.buka();
            
            Statement statement = koneksi.createStatement();
            String query = "SELECT id_transaksi FROM status ORDER BY id_transaksi DESC LIMIT 1";
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                String lastId = resultSet.getString("id_transaksi");
                int lastIdInt = Integer.parseInt(lastId);
                id_transaksi = lastIdInt + 1;
            } else {
                id_transaksi = FIRST_DIGIT * (int) Math.pow(10, NUM_DIGITS);
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return id_transaksi;
    }
}
