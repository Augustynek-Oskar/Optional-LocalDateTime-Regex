import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator {
    public boolean isPeselValid(String pesel){
        Pattern peselPattern = Pattern.compile("\\d{11}");
        Matcher matcher = peselPattern.matcher(pesel);
        boolean matches = matcher.matches();
        if (matches != true){
            System.out.println("Niepoprawny pesel");
        }
        return true;
    }
}
