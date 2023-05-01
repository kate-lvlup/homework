package app.util;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserUtilsTest {

     static UserUtils userUtils;

    @BeforeAll
    static void init() {
        userUtils = new UserUtils();
    }

    @Test
    void validateCorrectUsername() {
        String userName = "username";
        boolean result = userUtils.validateUsername(userName);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"username", "username1", "1user2name", "h3ll0", "dateObject"})
    void validateCorrectUsernameUsingParameters(String userName) {
        boolean result = userUtils.validateUsername(userName);
        assertTrue(result);
    }

    @Test
    void validateIncorrectUsername() {
        String userName = "!@$";
        boolean result = userUtils.validateUsername(userName);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", "as", "asd", "123", "2", "username!", "sdf@use^name", " ", "", "email@gmail.com", "QWERTY!"})
    void validateIncorrectUsernameUsingParameters(String userName) {
        boolean result = userUtils.validateUsername(userName);
        assertFalse(result);
    }

    @Test
    void validateCorrectPassword() {
        String userPassword = "password123!";
        boolean result = userUtils.validatePassword(userPassword);
        assertTrue(result);
    }

    @Test
    void validateIncorrectPassword() {
        String userPassword = "password123";
        boolean result = userUtils.validatePassword(userPassword);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"pas!", "@pas", "pa#s", "password123$", "!@#$"})
    void validateCorrectPasswordUsingParameters(String password) {
        boolean result = userUtils.validatePassword(password);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"pa!", "pass", "password123", "!@#"})
    void validateIncorrectPasswordUsingParameters(String password) {
        boolean result = userUtils.validatePassword(password);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"01/31/2022", "02/28/2022", "02/29/2000", "12/31/2022"})
    void validateCorrectDateUsingParameters(String date) {
        boolean result = userUtils.validateDate(date);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(
            strings = {"", " ", "asdf", "1234", "2022-12-02", "02-12-2022", "31/02/2022", "2022/31/02",
                    "02/29/1991", "13/02/2011", "03/32/1990"}
    )
    void validateIncorrectDateUsingParameters(String date) {
        boolean result = userUtils.validateDate(date);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"username@domain.address", "1@g.c", "a@2.c", "a@b.2", "katy123@gmail.com"})
    void validateCorrectEmail(String email) {
        boolean result = userUtils.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"katy!@gmail.com", "12!3@gmail.com", "katy@gmail@.com", "123@gm@il.com", "katy@gmail.c!m", "123@gmail.com#"})
    void validateIncorrectEmail(String email) {
        boolean result = userUtils.validateEmail(email);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"+380931234455", "+012345678910", "+000000000000", "+999999999999"})
    void validateCorrectPhoneNumber(String phoneNumber) {
        boolean result = userUtils.validatePhoneNumber(phoneNumber);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"+38093123445", "+0123456789100", "+0a0000000000", "+9@9999999999", "@380931234455"})
    void validateIncorrectPhoneNumber(String phoneNumber) {
        boolean result = userUtils.validatePhoneNumber(phoneNumber);
        assertFalse(result);
    }
}