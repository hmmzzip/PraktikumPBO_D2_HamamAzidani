/* 
 * File      : Manajer.java    03/05/24
 * Penulis   : Hamam Azidani
 * Deskripsi : File kelas Manajer
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
public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        super(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + this.tunjangan);
    }
}
