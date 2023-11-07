/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perpusdata;


/**
 *
 * @author ASUS
 */
public class Perpusdata {
    public static void main(String[] args) {
        System.out.println("Hello Dita!");
        loginform login = new loginform();
        login.setVisible(true);
        /*
        try {
            Koneksi tesKoneksi = new Koneksi();
            
            
            LoginClass tesLogin = new LoginClass();
            String username = null;
            String password = null;
            tesLogin.input();
            tesLogin.login(username, password);
            HitungDenda denda = new HitungDenda();
            denda.hitungDenda();
            
            CRUDAnggota tesCrudA = new CRUDAnggota();
            tesCrudA.read();
            tesCrudA.delete();
            
            CRUDBuku tesCrudB = new CRUDBuku();
            tesCrudB.update();
            
            Peminjaman pinjam = new Peminjaman();
            pinjam.prosedurPeminjaman();
            
            Pengembalian kembali = new Pengembalian();
            kembali.cekPeminjaman();
            
            
            tesKoneksi.tutup();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        */
    }
}