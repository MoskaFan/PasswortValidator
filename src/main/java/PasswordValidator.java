public class PasswordValidator {
public static boolean checkPasswordLength(String password){

    if(password.length()<=20){
        return true;
    }
    return false;

}

    public static boolean checkPasswordContainsNumbers(String password) {

        if(password.matches(".*\\d*")){
            return true;
        }
        return false;
    }

    public static boolean checkPasswordContainsLowerCaseCharacters(String password) {
        for(int i = 0; i < password.length();i++){
            if(Character.isLowerCase(password.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static boolean checkPasswordContainsUpperCaseCharacters(String password) {

        for(int i = 0; i < password.length();i++){
            if(Character.isUpperCase(password.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
