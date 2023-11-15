/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perpusdata;

import java.sql.SQLException;


/**
 *
 * @author ASUS
 */
public class Perpusdata {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello Dita!");
        HitungDenda hitung = new HitungDenda();
        hitung.hitungDenda();
        loginform login = new loginform();
        login.setVisible(true);
        Koneksi koneksi = new Koneksi();
        koneksi.tutup();
    }
}