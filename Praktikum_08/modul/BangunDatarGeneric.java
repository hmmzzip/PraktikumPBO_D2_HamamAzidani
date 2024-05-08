/* 
* File      : BangunDatarGeneric.java    08/05/24
* Penulis   : Hamam Azidani
* Deskripsi : kelas konstruksi generic untuk BangunDatar
*/

public class BangunDatarGeneric<T extends BangunDatar>{
    private T bangunDatar;

    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}