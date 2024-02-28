/*
Nama : Hamam Azidani
NIM : 24060122130099
Nama file : Titik.java
Deskripsi : File untuk class Titik
*/

public class Titik {
	private double absis;
	private double ordinat;

	public Titik(double absis, double ordinat){
		this.absis = absis;
		this.ordinat = ordinat;
	}


    public Titik(){
        this(0, 0);
    }

	public void setAbsis(double absis){
		this.absis = absis;
	}
	
	public void setOrdinat(double ordinat){
		this.ordinat = ordinat;
	}

	public double getAbsis(){
		return absis;
	}

	public double getOrdinat(){
		return ordinat;
	}

	public double getJarakPusat(){
		return Math.sqrt(this.absis * this.absis + this.ordinat * this.ordinat);
	}

    public void refleksiX(){
        this.absis *= -1;
    }

    public void refleksiY(){
        this.ordinat *= -1;
    }

	public Titik getRefleksiX(){
		Titik titik = new Titik(absis, ordinat);
		titik.refleksiX();
		return titik;
	}

	public Titik getRefleksiY(){
		Titik titik = new Titik(absis, ordinat);
		titik.refleksiY();
		return titik;
	}
}