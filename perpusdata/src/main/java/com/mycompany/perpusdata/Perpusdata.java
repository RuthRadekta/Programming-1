/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perpusdata;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Perpusdata {

    public static void main(String[] args) {
        System.out.println("Hello Dita!");
        try {
            Koneksi tesKoneksi = new Koneksi();
            LoginClass tesLogin = new LoginClass();
            String username = null;
            String password = null;
            tesLogin.input();
            tesLogin.login(username, password);
            
            /*
            CRUDAnggota tesCrudA = new CRUDAnggota();
            tesCrudA.read();
            tesCrudA.delete();
            
            CRUDBuku tesCrudB = new CRUDBuku();
            tesCrudB.update();
            
            Peminjaman pinjam = new Peminjaman();
            pinjam.cekAnggota();
            pinjam.cekBuku();
            
            Peminjaman pinjam = new Peminjaman();
            pinjam.prosedurPeminjaman();
            */
            
            Pengembalian kembali = new Pengembalian();
            kembali.cekPeminjaman();
            
            tesKoneksi.tutup();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
