import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    final static String CONTACTS_PATH = "E:\\PROGRAMOWANIE\\KURSY\\PROJEKTY\\Optional-LocalDateTime-Regex\\src\\main\\resources\\Contacts";

    Map <String, PersonInfo> phoneBookMap = phoneBookMapFromFile();

    public Map<String, PersonInfo> phoneBookMapFromFile (){
        Map <String, PersonInfo> phoneBookMap = new HashMap<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(CONTACTS_PATH));
            String line;

            while((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(":");
                String fullName = parts[0];
                String address = parts[1];
                String phoneNum = parts[2];
                PersonInfo personInfo = new PersonInfo(fullName, address, phoneNum);
                phoneBookMap.put(fullName, personInfo);
            }

        }
        catch (FileNotFoundException e) {
            System.out.println("File not found :(");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return phoneBookMap;
    }

    public void addPerson(String fullname, String address){
        PersonInfo personInfo = new PersonInfo(fullname, address);
        phoneBookMap.put(fullname, personInfo);
        saveToFile();
    }

    public void addPerson(String fullname, String address, String phoneNum){
            PersonInfo personInfo = new PersonInfo(fullname, address, phoneNum);
            phoneBookMap.put(fullname, personInfo);
            saveToFile();
    }

    public PersonInfo searchFor(String fullname) throws Exception {
        if (phoneBookMap.containsKey(fullname)){
            return phoneBookMap.get(fullname);
        }
        else throw new Exception("Nie znaleziono...");
    }

    public PersonInfo getPersonInfo(String fullname){
        return phoneBookMap.get(fullname);
    }

    public void saveToFile() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(CONTACTS_PATH))) {

            for (Map.Entry<String, PersonInfo> entry : phoneBookMap.entrySet()) {
                bufferedWriter.write(entry.getKey() + ": " + entry.getValue().getAddress() + ": " + entry.getValue().getPhoneNumber());
                bufferedWriter.newLine();
            }
        }
        catch (IOException e) {
            throw new RuntimeException("Error while saving to file...");
        }
    }

}
