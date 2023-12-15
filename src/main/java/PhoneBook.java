import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map <String, PersonInfo> phoneBookMap = new HashMap<>();
    public void addPerson(String fullname, String address, String phoneNum){
        PersonInfo personInfo = new PersonInfo(fullname, address, phoneNum);
        phoneBookMap.put(fullname, personInfo);
    }
    public PersonInfo searchFor(String fullname) throws Exception {
        if (phoneBookMap.containsKey(fullname)){
            return phoneBookMap.get(fullname);
        }
        else throw new Exception("Nie znaleziono...");
    }

}
