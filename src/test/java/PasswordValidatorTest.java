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
        assertTrue(actual);



    }
}