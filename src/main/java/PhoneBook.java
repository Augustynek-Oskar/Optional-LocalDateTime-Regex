import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {

        Map <String, PersonInfo> phoneBookMap = new HashMap<>();
        phoneBookMap.put("Maria Wesołowska", new PersonInfo("Maria Wesołowska", "ul. Wesoła"));
        phoneBookMap.put("Adam Nowak", new PersonInfo("Adam Nowak", "ul. Nowa", "623592359"));
        phoneBookMap.put("Jan Kowalski", new PersonInfo("Jan Kowalski", "ul. Pierwsza"));

        System.out.println(phoneBookMap.get("Adam Nowak"));
        System.out.println(phoneBookMap.keySet());

    }
}
