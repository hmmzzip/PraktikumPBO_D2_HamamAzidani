/*
Nama : Hamam Azidani
NIM : 24060122130099
File: BankApp.java
Deskripsi: Program untuk Bank App
*/

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);
        System.out.println("Saldo saat ini: $" + account.getBalance());

        try {
            // Scenario saldo mencukupi
            account.withdraw(200.0);
            System.out.println("Saldo saat ini: $" + account.getBalance());

            // Scenario saldo tidak mencukupi
            account.withdraw(400.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
