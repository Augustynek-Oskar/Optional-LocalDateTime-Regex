import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public boolean isPasswordValid(String password){
        Pattern passwordPattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?!.*(2023|23)).{7,}$");
        Matcher passwordMatcher = passwordPattern.matcher(password);
        return passwordMatcher.matches();
    }
}
