import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class PasswordValidatorTest {

    @Test
    void when_Password_Longer_Than_20() {
        //GIVEN
        String password = "MEZwRncAC87afxvf7RqN";
        //boolean expectedResult = (password>=20);

        //WHEN
        boolean actual = PasswordValidator.checkPasswordLength(password);

        //THEN
        assertTrue(actual);

    }
    @Test
    void when_Password_contains_numbers() {

        //GIVEN
        String password = "MEZwRn89AC87afxvf7RqN";

        //WHEN
        boolean actual = PasswordValidator.checkPasswordContainsNumbers(password);

        //THEN
        assertTrue(actual); }
@Test
        void when_Password_contains_lowercase_characters(){

            //GIVEN
            String password = "MEZWRN89AC87üABTZ7RQN";

            //WHEN
            boolean actual = PasswordValidator.checkPasswordContainsLowerCaseCharacters(password);

            //THEN
            assertTrue(actual);

    }
    @Test
    void when_Password_contains_uppercase_characters(){

        //GIVEN
        String password = "MEZwRn89AC87afxvf7RqN";

        //WHEN
        boolean actual = PasswordValidator.checkPasswordContainsUpperCaseCharacters(password);

        //THEN
        assertTrue(actual);

    }
    @Test
    void when_password_is_bad(){
        //GIVEN
        String password = "MEZwRn89AC87afxvf7RqN";

        //WHEN
        boolean actual = PasswordValidator.check_if_password_good(password);

        //THEN
        assertTrue(actual);
    }
}