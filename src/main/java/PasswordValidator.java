import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) {
        isPasswordValid("2WWawW");
    }
    public static void isPasswordValid(String password){
        Pattern passwordPattern = Pattern.compile("[a-z]*([0-9]+[A-Z]+)");
        Matcher passwordMatcher = passwordPattern.matcher(password);
        boolean matches = passwordMatcher.find();
        if (!matches){
            System.out.println("false");
        }
        else System.out.println("true");
    }
}
