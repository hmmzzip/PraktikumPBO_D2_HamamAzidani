/* 
* File      : ArmadaKendaraan.java    24/05/24
* Penulis   : Hamam Azidani
* Deskripsi : File kelas ArmadaKendaraan
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class ArmadaKendaraan {
    private List<Vehicle> armada = new ArrayList<>();

    public void tambahArmada(Collection<? extends Vehicle> koleksi) {
        armada.addAll(koleksi);
    }

    public List<Vehicle> getAllArmada() {
        return new ArrayList<>(armada);
    }
}