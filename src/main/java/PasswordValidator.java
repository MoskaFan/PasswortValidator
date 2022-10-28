public class PasswordValidator {
public static boolean checkPassword(String password){

    if(password.length()<=20){
        return true;
    }
    return false;

}

}
