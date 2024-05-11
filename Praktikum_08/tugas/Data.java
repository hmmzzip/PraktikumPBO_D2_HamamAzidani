/* 
* File      : Data.java    10/05/24
* Penulis   : Hamam Azidani
* Deskripsi : File kelas Data
*/

class Data<T> {
    private T isi;

    T getIsi() {
        return this.isi;
    }

    void setIsi(T x) {
        this.isi = x;
    }
}