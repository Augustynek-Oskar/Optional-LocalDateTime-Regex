import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @ParameterizedTest
    @DisplayName("Should check if password is valid")
    @CsvSource (value = {
            "aWeWa2023:false",
            "Abc125:false",
            "Abc1234:false",
            "ABCdef1009:true",
            "Password124722:true"},
            delimiter = ':')
    void isPasswordValid(String input, String expected) {
        PasswordValidator passwordValidator = new PasswordValidator();
        String actualValue = String.valueOf(passwordValidator.isPasswordValid(input));
        Assertions.assertEquals(expected, actualValue);
    }
}