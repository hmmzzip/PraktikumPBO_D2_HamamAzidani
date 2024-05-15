/* 
* File      : Person.java    15/05/24
* Penulis   : Hamam Azidani
* Deskripsi : Person databse model
*/

public class Person{
    private int id;
    private String name;

    public Person(String n){
        name = n;
    }

    public Person(int i, String n){
        id = i;
        name = n;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}