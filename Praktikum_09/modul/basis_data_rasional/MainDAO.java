/* 
* File      : MainDAO.java    15/05/24
* Penulis   : Hamam Azidani
* Deskripsi : Main program untuk akses DAO
*/

public class MainDAO{
    public static void main(String args[]){
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try{
            m.getpPersonDAO().savePerson(person);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}