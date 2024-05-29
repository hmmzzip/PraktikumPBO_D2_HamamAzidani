import java.util.HashMap;
import java.util.Map;

/*
 * File     : LambdaMap.java     29/05/24
 * Penulis  : Hamam Azidani
 * Deskripsi: Implementasi lambda pada Map, digunakan untuk menampilkan key dan value
 */

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat Map dengan key NIM dan value nama mahasiswa
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060122130099", "Hamam Azidani");
        mahasiswaMap.put("24060122130079", "Sultan Alamsyah Borneo Arifin");
        mahasiswaMap.put("24060122130059", "Arifin Nurmuhammad Haris");
        mahasiswaMap.put("24060122130083", "Muhammad Ahsan Yudhistira");

        // Menggunakan lambda untuk menampilkan key dan value
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}