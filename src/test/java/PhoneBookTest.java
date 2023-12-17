import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    @Test
    @DisplayName("Should add PersonInfo to hashmap")
    void addPerson() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPerson("Jan Kowalski", "Ul. Nowa", "2342346343");

        String newlyAddedPerson = String.valueOf(phoneBook.getPersonInfo("Jan Kowalski"));
        assertEquals(" {Full name: Jan Kowalski, address: Ul. Nowa, phone number: 2342346343}", newlyAddedPerson);


    }

    @Test
    @DisplayName("Should search for key in hashmap")
    void searchFor() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPerson("Jan Kowalski", "Ul. Nowa", "2342346343");
        try {
            PersonInfo actualValue = phoneBook.searchFor("Jan Kowalski");
            assertEquals(phoneBook.getPersonInfo("Jan Kowalski"), actualValue);
            assertThrows(Exception.class, () -> phoneBook.searchFor("Jan Kowalczyk"));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    @DisplayName("Should check if file contains certain key")
    void phoneBookMapFromFile() {
        PhoneBook phoneBook = new PhoneBook();
        boolean actualValue = phoneBook.phoneBookMapFromFile().containsKey("Jan Kowalski");
        assertTrue(actualValue);
    }
}