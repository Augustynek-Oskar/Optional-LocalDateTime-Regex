import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import javax.swing.plaf.ActionMapUIResource;

import static org.junit.jupiter.api.Assertions.*;

class BirthdayTest {
    Birthday birthday = new Birthday();
    @ParameterizedTest
    @CsvSource (value = {
            "2000/05/25:Incorrect format. Try YYYY-MM-DD",
            "1998-10-12:25",
            "2010-01-01:13"},
            delimiter = ':')
    void getAge(String input, String expected) {
        String actualValue = birthday.getAge(input);
        assertEquals(expected, actualValue);
    }

    @ParameterizedTest
    @CsvSource (value = {
            "2000-05/25:Incorrect format. Try YYYY-MM-DD",
            "1998-10-12:MONDAY",
            "2010-01-01:FRIDAY"},
            delimiter = ':')
    void getDayOfTheWeek(String input, String expected) {
        String actualValue = birthday.getDayOfTheWeek(input);
        assertEquals(expected, actualValue);
    }

    @ParameterizedTest
    @CsvSource (value = {
            "2000.05.25:Incorrect format. Try YYYY-MM-DD",
            "1998-10-12:42",
            "2010-01-01:1"},
            delimiter = ':')
    void getWeekOfTheYear(String input, String expected) {
        String actualValue = birthday.getWeekOfTheYear(input);
        assertEquals(expected, actualValue);
    }

}