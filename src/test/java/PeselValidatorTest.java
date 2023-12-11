import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PeselValidatorTest {

    @ParameterizedTest
    @CsvSource (value = {"12345678902:true", "123:false", "23154334198:true"}, delimiter = ':')
    void isPeselValid(String input, String expected) {
        PeselValidator peselValidator = new PeselValidator();
        String actualValue = (String.valueOf(peselValidator.isPeselValid(input)));
        Assertions.assertEquals(expected, actualValue);
    }
}