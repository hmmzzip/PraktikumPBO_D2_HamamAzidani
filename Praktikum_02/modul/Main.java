/*
Nama : Hamam Azidani
NIM : 24060122130099
Nama file : Main.java
Deskripsi : File untuk Main Titik & Garis
*/

public class Main{
    public static void main(String[] args){
        System.out.println("-----------TITIK-----------");
        Titik t1, t2, t3;

        t1 = new Titik(1.0, 2.0);
        t2 = new Titik(3.0, 4.0);
        t3 = new Titik(5.0, 6.0);

        System.out.println("t1 : (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("t2 : (" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("t3 : (" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");

        System.out.println("Jarak titik t1 terhadap titik pusat : " + t1.getJarakPusat());
        System.out.println("Jarak titik t2 terhadap titik pusat : " + t2.getJarakPusat());
        System.out.println("Jarak titik t3 terhadap titik pusat : " + t3.getJarakPusat());

        Titik t4 = t1.getRefleksiX();
        System.out.println("t1 setelah RefleksiX : (" + t4.getAbsis() + ", " + t4.getOrdinat() + ")");
        Titik t5 = t1.getRefleksiY();
        System.out.println("t1 setelah RefleksiY : (" + t5.getAbsis() + ", " + t5.getOrdinat() + ")");

        System.out.println("-----------GARIS-----------");
        Garis g1, g2;

        g1 = new Garis (t1, t4);
        g2 = new Garis (t2, t3);

        System.out.println("g1 : ((" + g1.geTitikAwal().getAbsis() + ", " + g1.geTitikAwal().getOrdinat() + "), (" + + g1.geTitikAkhir().getAbsis() + ", " + g1.geTitikAkhir().getOrdinat() + "))" );
        System.out.println("g2 : ((" + g2.geTitikAwal().getAbsis() + ", " + g2.geTitikAwal().getOrdinat() + "), (" + + g2.geTitikAkhir().getAbsis() + ", " + g2.geTitikAkhir().getOrdinat() + "))" );

        System.out.println("Panjang garis g1 : " + g1.getPanjang());
        System.out.println("Panjang garis g2 : " + g2.getPanjang());

        System.out.println("Gradien garis g1 : " + g1.getGradien());
        System.out.println("Gradien garis g2 : " + g2.getGradien());

        Garis g3 = g1.getRefleksiY();
        System.out.println("g1 setelah RefleksiY : ((" + g3.geTitikAwal().getAbsis() + ", " + g3.geTitikAwal().getOrdinat() + "), (" + + g3.geTitikAkhir().getAbsis() + ", " + g3.geTitikAkhir().getOrdinat() + "))" );
        
        Titik t6 = new Titik(0.0, 1.0);
        Garis g4 = new Garis(t4, t6);
        System.out.println("g4 : ((" + g4.geTitikAwal().getAbsis() + ", " + g4.geTitikAwal().getOrdinat() + "), (" + + g4.geTitikAkhir().getAbsis() + ", " + g4.geTitikAkhir().getOrdinat() + "))" );

        System.out.println("Apakah g1 & g2 Tegak Lurus? : " + g1.isTegakLurus(g2));
        System.out.println("Apakah g2 & g4 Tegak Lurus? : " + g2.isTegakLurus(g4));

    }
}