/* 
* File      : MapTest.java    08/05/24
* Penulis   : Hamam Azidani
* Deskripsi : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
*/

 import java.util.*;

 public class MapTest{
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "satu");
        map.put(2, "dua");

        System.out.println(map.get(1));

        Set<Integer> keys = map.keySet();

        for (Integer key : keys) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}