/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.perpusdata;

/**
 *
 * @author refah
 */
public interface AnggotaInterface {
    public void create(int id_anggota, String nama, String jenis_kelamin, String alamat, String email);
    public void read();
    public void update(int id_anggotaBaru, String namaBaru, String jenis_kelaminBaru, String alamatBaru, String emailBaru);
    public void delete();
}
