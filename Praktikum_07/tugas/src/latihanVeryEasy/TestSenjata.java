/* 
 * File      : TestSenjata.java    03/05/24
 * Penulis   : Hamam Azidani
 * Deskripsi : File kelas main TestSenjata
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanVeryEasy;

/**
 *
 * @author ASUS
 */
public class TestSenjata {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");

        System.out.println("Jumlah peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 mengisi peluru ");
        ak47.setPeluru(5);
        System.out.println("Jumlah peluru AK47: " + ak47.getPeluru());

        System.out.println("AK47 menembak");
        ak47.menembak(1);
    }
}
