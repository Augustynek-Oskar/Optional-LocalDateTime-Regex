import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;

import static org.junit.jupiter.api.Assertions.*;

class UrlValidatorTest {

    @ParameterizedTest
    @DisplayName("Should return true if url is valid")
    @ValueSource (strings = {"http://www.onet.pl", "https://mail.google.com", "http://wiadmosci.onet.pl", "http://onet.pl"})
    void isUrlValid(String yourUrl) {
        UrlValidator urlValidator = new UrlValidator();
        Assertions.assertTrue(urlValidator.isUrlValid(yourUrl));
    }
}