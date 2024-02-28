/*
Nama : Hamam Azidani
NIM : 24060122130099
Nama file : Titik.java
Deskripsi : File untuk class Titik
*/

public class Titik {
	float absis;
	float ordinat;
	static int counterTitik;

	public Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}

    // Titik(float absis, float o){
    //     this.absis = absis;
    //     ordinat = o;
    //     counterTitik++;
    // }

    public Titik(float a, float o){
        absis = a;
        ordinat = o;
        counterTitik++;
    }

	public void setAbsis(float a){
		absis = a;
	}
	
	public void setOrdinat(float o){
		ordinat = o;
	}

	public float getAbsis(){
		return absis;
	}

	public float getOrdinat(){
		return ordinat;
	}

	public static int getCounterTitik(){
		return counterTitik;
	}
	
}