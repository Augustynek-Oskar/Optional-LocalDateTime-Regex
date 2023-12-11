import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlValidator {
    public boolean isUrlValid(String yourUrl){
        Pattern urlPattern = Pattern.compile("^(https|http)://[a-z.]*$");
        Matcher url = urlPattern.matcher(yourUrl);
        boolean matches = url.matches();
        if (!matches){
            System.out.println("Invalid url");
            return false;
        }
        return true;
    }
}
