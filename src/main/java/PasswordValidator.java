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
}
