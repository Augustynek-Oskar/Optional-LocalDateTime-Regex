import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberChooser {
    public static void main(String[] args) {


        Pattern integersPattern = Pattern.compile("([0-9]+)*");
        Matcher integers = integersPattern.matcher("12123123");
        boolean matchesIntegers = integers.matches();
        System.out.println("Czy pasuje do liczb całkowitych: " + matchesIntegers);


        Pattern floatsPattern = Pattern.compile("([0-9]+)*.([0-9]+)*");
        Matcher floats = floatsPattern.matcher("244.008");
        boolean matchesFloats = floats.matches();
        System.out.println("Czy pasuje do liczb zmiennoprzecinkowych: " + matchesFloats);

        Pattern scientificNotationPattern = Pattern.compile("([0-9]+)*.([0-9]+)*(e|E)([+-])([0-9]+)*");
        Matcher scientificNotation = scientificNotationPattern.matcher("1.234e+07");
        boolean matchesScientificNotation = scientificNotation.matches();
        System.out.println("Czy pasuje do notacji naukowej: " + matchesScientificNotation);
    }
}
