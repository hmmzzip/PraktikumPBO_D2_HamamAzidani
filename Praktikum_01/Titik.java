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

	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}

    // Titik(float absis, float o){
    //     this.absis = absis;
    //     ordinat = o;
    //     counterTitik++;
    // }

    Titik(float a, float o){
        absis = a;
        ordinat = o;
        counterTitik++;
    }

	void setAbsis(float a){
		absis = a;
	}
	
	void setOrdinat(float o){
		ordinat = o;
	}

	float getAbsis(){
		return absis;
	}

	float getOrdinat(){
		return ordinat;
	}

	static int getCounterTitik(){
		return counterTitik;
	}
}