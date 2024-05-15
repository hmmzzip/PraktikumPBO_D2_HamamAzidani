/* 
* File      : DAOManager.java    15/05/24
* Penulis   : Hamam Azidani
* Deskripsi : pengelola DAO dalam program
*/

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getpPersonDAO(){
        return personDAO;
    }
}