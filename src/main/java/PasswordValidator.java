import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) {
        isPasswordValid("gowO");
    }
    public static void isPasswordValid(String password){
        Pattern passwordPattern = Pattern.compile("^(([a-z]*){7,})[A-Z]+$");
        Matcher passwordMatcher = passwordPattern.matcher(password);
        boolean matches = passwordMatcher.matches();
        if (!matches){
            System.out.println("false");
        }
        else System.out.println("true");
    }
}
