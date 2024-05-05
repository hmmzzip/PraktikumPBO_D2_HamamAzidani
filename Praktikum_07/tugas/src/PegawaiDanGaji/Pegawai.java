/* 
 * File      : Pegawai.java    03/05/24
 * Penulis   : Hamam Azidani
 * Deskripsi : File kelas Pegawai
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PegawaiDanGaji;

/**
 *
 * @author ASUS
 */
public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + this.nama + ", Gaji Pokok : " + this.gajiPokok);
    }
}
