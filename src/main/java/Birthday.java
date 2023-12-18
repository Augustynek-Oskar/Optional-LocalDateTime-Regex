import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Birthday {
    public String getAge(String dateOfBirth){
        if (checkDatePattern(dateOfBirth)){
            LocalDate localDateNow = LocalDate.now();
            LocalDate birthDate = LocalDate.parse(dateOfBirth);
            Period period = Period.between(birthDate, localDateNow);
            System.out.println("You are: " + (localDateNow.getYear() - birthDate.getYear()) + " years old!");
            return String.valueOf(localDateNow.getYear() - birthDate.getYear());
        }
       else return "Incorrect format. Try YYYY-MM-DD";
    }

    public String getDayOfTheWeek(String dateOfBirth){
        if (checkDatePattern(dateOfBirth)){
            LocalDate birthDate = LocalDate.parse(dateOfBirth);
            System.out.println("You were born on: " + birthDate.getDayOfWeek());
            return String.valueOf(birthDate.getDayOfWeek());
        }
        else return "Incorrect format. Try YYYY-MM-DD";
    }

    public String getWeekOfTheYear(String dateOfBirth){
        if (checkDatePattern(dateOfBirth)){
            LocalDate birthDate = LocalDate.parse(dateOfBirth);
            int weekOfTheYear = birthDate.get(WeekFields.of(Locale.ENGLISH).weekOfYear());
            System.out.println("On the: " + weekOfTheYear + " week of the year!");
            return String.valueOf(weekOfTheYear);
        }
        else return "Incorrect format. Try YYYY-MM-DD";
    }

    public String getBrithdayInfo(String dateOfBirth){
        return getAge(dateOfBirth) + " " + getDayOfTheWeek(dateOfBirth) + " " + getWeekOfTheYear(dateOfBirth);
    }
    public static boolean checkDatePattern(String input){
        Pattern pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
