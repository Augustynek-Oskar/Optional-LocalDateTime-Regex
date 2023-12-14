import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Locale;

public class Birthday {
    public static void main(String[] args) {

    }

    public static String getAge(String dateOfBirth){
        LocalDate localDateNow = LocalDate.now();
        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        Period period = Period.between(birthDate, localDateNow);
        System.out.println(localDateNow.getYear() - birthDate.getYear());
        return String.valueOf(localDateNow.getYear() - birthDate.getYear());
    }

    public static String getDayOfTheWeek(String dateOfBirth){
        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        System.out.println(birthDate.getDayOfWeek());
        return String.valueOf(birthDate.getDayOfWeek());
    }

    public static String getWeekOfTheYear(String dateOfBirth){
        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        int weekOfTheYear = birthDate.get(WeekFields.of(Locale.GERMANY).weekOfYear());
        System.out.println(weekOfTheYear);
        return String.valueOf(weekOfTheYear);
    }
}
