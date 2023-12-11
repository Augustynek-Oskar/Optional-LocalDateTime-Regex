import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberChooser {
    public static void main(String[] args) {
        String[] numbers = {"342", "5.34", "756","1.234e+07", "7.234243E-02", "6.09", "3457", "87", "1.0001", "3", "5"};
        List <String> numbersList = List.of(numbers);
        showAllIntegers(numbersList);

    }
    public static void showAllIntegers (List<String> text){
        for (int i = 0; i <= text.size() - 1; i++){
            if (text.get(i).matches("([0-9]+)*")){
                System.out.println(text.get(i));
            }
        }
    }
}
