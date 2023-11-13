/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.perpusdata;

/**
 *
 * @author refah
 */
public interface BukuInterface {
    public void create(int id_buku, String judul, String penulis, String penerbit, int jumlah_halaman);
    public void read();
    public void update(int id_bukuBaru, String judulBaru, String penulisBaru, String penerbitBaru, String jumlah_halamanBaru);
    public void delete();
}
