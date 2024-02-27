/*
Nama : Hamam Azidani
NIM : 24060122130099
Nama file : MTitik.java
Deskripsi : File untuk Main class Titik
*/

public class MTitik{
	public static void main(String[] args) {
		Titik t1;
		Titik t2;
        Titik t3;

		t1 = new Titik();
		t2 = new Titik();
        t3 = new Titik(5,6);

		t1.setAbsis(1);
		t1.setOrdinat(2);
		t2.setAbsis(3);
		t2.setOrdinat(4);

		int counterTitik = Titik.getCounterTitik();
		System.out.println("Jumlah objek titik: " + counterTitik);
        System.out.println("t1("+t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("t1("+t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("t1("+t3.getAbsis() + ", " + t3.getOrdinat() + ")");
	}
}