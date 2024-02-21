/*
Nama : Hamam Azidani
NIM : 24060122130099
Nama file : Titik.java
Deskripsi : File untuk class Titik
*/

public class Titik{
    double absis;
    double ordinat;
    static int counterTitik;

    Titik(){
        counterTitik++;
        absis = 0;
        ordinat = 0;
    }

    void setAbsis(double a){
        absis = a;
    }

    void setOrdinat(double o){
        ordinat = o;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    static int getCounterTitik(){
        return counterTitik;
    }
}