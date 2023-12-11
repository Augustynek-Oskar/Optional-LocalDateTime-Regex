import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator {
    public static void main(String[] args) {
        Pattern peselPattern = Pattern.compile("\\d{11}");
        Matcher matcher = peselPattern.matcher("12345678911");

        boolean matches = matcher.matches();
        System.out.println(matches);
    }
}
