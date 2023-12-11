import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberChooser {
    public static void main(String[] args) {


        Pattern integersPattern = Pattern.compile("([0-9]+)*");
        Matcher matcher = integersPattern.matcher("12123123");

        boolean matches = matcher.matches();
        System.out.println("Czy pasuje do liczb całkowitych: " + matches);

    }
}
