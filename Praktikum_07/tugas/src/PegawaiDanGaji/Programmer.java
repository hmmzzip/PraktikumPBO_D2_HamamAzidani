/* 
 * File      : Programmer.java    03/05/24
 * Penulis   : Hamam Azidani
 * Deskripsi : File kelas Programmer
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
public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        super(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + this.bonus);
    }
}
