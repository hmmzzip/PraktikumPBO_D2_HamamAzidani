/* 
 * File      : MLingkaran.java    20/03/24
 * Penulis   : Hamam Azidani
 * Deskripsi : implementasi cara menghitung luas lingkaran
 */

import java.util.Scanner;

class MLingkaran{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jejari lingkaran : ");
        double r = scan.nextDouble();
        Lingkaran l = new Lingkaran(r);
        System.out.print("Luas lingkaran dengan jejari " + r + " satuan adalah " + l.hitungLuas());
        scan.close();
    }
}