import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PasswordValidator {
    public static boolean checkPasswordLength(String password) {

        if (password.length() <= 20) {
            return true;
        }
        return false;

    }

    public static boolean checkPasswordContainsNumbers(String password) {

        if (password.matches(".*\\d*")) {
            return true;
        }
        return false;
    }

    public static boolean checkPasswordContainsLowerCaseCharacters(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkPasswordContainsUpperCaseCharacters(String password) {

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean check_if_password_good(String password) {
        List<String> tabuWords = new ArrayList<>();
        Collections.addAll(tabuWords, "123456", "123456789", "12345678", "password", "1234567", "123123", "1234567890", "111111", "abc123", "00000", "123456", "123456789", "12345", "qwerty", "password", "12345678", "111111", "123123", "1234567890", "1234567", "qwerty123", "000000", "1q2w3e", "aa12345678", "abc123", "password1", "1234", "qwertyuiop", "123321", "password123");
        for (String word : tabuWords) {
            if (password.equals(word)) {
                System.out.println("Bad password");
                return false;
            }
        }
        return true;
    }

    public static boolean containsLowerCaseWithAscii(String password) {
        char[] passwordArray = password.toCharArray();
        for (char letter : passwordArray) {
            int asciiValue = (int) letter;
            if (asciiValue >= 97 && asciiValue <= 122) {
                System.out.println("Buchstabe: " + letter + "; ascii Wert : " + asciiValue);
                return true;
            }

        }
        return false;
    }

    public static boolean isItADumbPassword(String password) {
        List<String> dumbPasswords = new ArrayList<>();
        Collections.addAll(dumbPasswords, "123456", "123456789", "12345", "qwerty", "password", "12345678", "111111", "123123", "1234567890", "qwerty123", "1234567","000000","1q2w3e","aa12345678","abc123","password1","1234","qwertyuiop","123321","password123");
        // Quelle Passwörter: https://en.wikipedia.org/wiki/List_of_the_most_common_passwords

        Iterator it = dumbPasswords.iterator();
        while (it.hasNext()) {
            if (password == it.next()) {
                System.out.println("password: " + password);return true;
    }}
        return false;
    }
}
