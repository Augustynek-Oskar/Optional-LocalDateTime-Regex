import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlValidator {
    public static void main(String[] args) {
        Pattern urlPattern = Pattern.compile("^(https|http)://[a-z.]*$");
        Matcher onetLongUrl = urlPattern.matcher("http://www.onet.pl");
        Matcher gmailUrl = urlPattern.matcher("https://mail.google.com");
        Matcher onetNewsUrl = urlPattern.matcher("http://wiadmosci.onet.pl");
        Matcher onetShortUrl = urlPattern.matcher("http://onet.pl");

        boolean matchesOnetLongUrl = onetLongUrl.matches();
        System.out.println(matchesOnetLongUrl);

        boolean matchesGmailUrl = gmailUrl.matches();
        System.out.println(matchesGmailUrl);

        boolean matchesOnetNewsUrl = onetNewsUrl.matches();
        System.out.println(matchesOnetNewsUrl);

        boolean matchesOnetShortUrl = onetShortUrl.matches();
        System.out.println(matchesOnetShortUrl);

    }
}
