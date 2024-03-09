/*
Nama : Hamam Azidani
NIM : 24060122130099
File: UserInputValidator.java
Deskripsi: Program untuk User Input Validator
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInputValidator {
    
    public static void validateUsername(String username) {
        assert username.length() >= 5 && username.length() <= 20 : "Username length must be between 5 and 20 characters";
        assert username.matches("[a-zA-Z][a-zA-Z0-9_]+") : "Invalid username";
    }

    public static void validateEmail(String email) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        assert matcher.matches() : "Invalid email address";
    }

    public static void validateAge(int age) {
        assert age >= 17 && age <= 99 : "Age must be between 17 and 99 years";
    }
}
