/*
Nama : Hamam Azidani
NIM : 24060122130099
Nama file : Garis.java
Deskripsi : File untuk class Garis
*/

public class Garis {
    private Titik tAwal;
    private Titik tAkhir;

    public Garis(Titik tAwal, Titik tAkhir){
        this.tAwal = tAwal;
        this.tAkhir = tAkhir;
    }

    public void setTitikAwal(Titik tAwal){
        this.tAwal = tAwal;
    }

    public void setTitikAkhir(Titik tAkhir){
        this.tAkhir = tAkhir;
    }

    public Titik geTitikAwal(){
        return tAwal;
    }

    public Titik geTitikAkhir(){
        return tAkhir;
    }

    public double getPanjang(){
        double x1 = geTitikAwal().getAbsis();
        double y1 = geTitikAwal().getOrdinat();
        double x2 = geTitikAkhir().getAbsis();
        double y2 = geTitikAkhir().getOrdinat();
        return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
    }

    public double getGradien(){
        double x1 = geTitikAwal().getAbsis();
        double y1 = geTitikAwal().getOrdinat();
        double x2 = geTitikAkhir().getAbsis();
        double y2 = geTitikAkhir().getOrdinat();
        return (y2 - y1) / (x2 - x1);
    }

    public Garis getRefleksiX(){
        return new Garis((geTitikAwal().getRefleksiX()), (geTitikAkhir().getRefleksiX()));
    }

    public Garis getRefleksiY(){
        return new Garis((geTitikAwal().getRefleksiY()), (geTitikAkhir().getRefleksiY()));
    }

    public boolean isTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == -1;
    }
}
