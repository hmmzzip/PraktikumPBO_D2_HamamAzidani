/* 
* File      : A.java    02/05/24
* Penulis   : Hamam Azidani
* Deskripsi : Polimorfisme Ad Hoc: Overloading 
*/

/* 
Polimorfisme Ad Hoc: Overloading
Polimorfisme ini berbasis overloading merupakan konsep dalam pemrograman di mana sebuah kelas dapat memiliki 
beberapa metode dengan nama yang sama tetapi dengan parameter yang berbeda. 
Ini memungkinkan kita untuk memiliki beberapa implementasi dari metode yang sama dengan tindakan yang berbeda 
tergantung pada jenis dan jumlah parameter yang diberikan. 
*/

class Calculator {
    // Overloading method untuk menjumlahkan bilangan bulat
    public int add(int a, int b) {
        return a + b;
    }

    // Overloading method untuk menjumlahkan bilangan real
    public double add(double a, double b) {
        return a + b;
    }
}

public class A {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(2, 5)); // Hasilnya 7
        System.out.println(calculator.add(2.5, 5.5)); // Hasilnya 8.0
    }
}