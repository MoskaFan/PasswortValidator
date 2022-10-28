import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @org.junit.jupiter.api.Test
    void when_Password_Longer_Than_20() {
        //GIVEN
        String password = "MEZwRncAC87afxvf7RqN";
        //boolean expectedResult = (password>=20);

        //WHEN
        boolean actual = PasswordValidator.checkPassword(password);

        //THEN
        assertTrue(actual);






    }
}