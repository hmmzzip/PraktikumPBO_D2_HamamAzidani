/* 
 * File      : BangunDatar.java    20/03/24
 * Penulis   : Hamam Azidani
 * Deskripsi : kelas abstrak, berisi abstraksi bangun datar
 */

public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}