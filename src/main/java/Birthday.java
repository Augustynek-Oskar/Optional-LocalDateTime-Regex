import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Locale;

public class Birthday {
    public static String getAge(String dateOfBirth){
        LocalDate localDateNow = LocalDate.now();
        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        Period period = Period.between(birthDate, localDateNow);
        System.out.println("You are: " + (localDateNow.getYear() - birthDate.getYear()) + " years old!");
        return String.valueOf(localDateNow.getYear() - birthDate.getYear());
    }

    public static String getDayOfTheWeek(String dateOfBirth){
        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        System.out.println("You were born on: " + birthDate.getDayOfWeek());
        return String.valueOf(birthDate.getDayOfWeek());
    }

    public static String getWeekOfTheYear(String dateOfBirth){
        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        int weekOfTheYear = birthDate.get(WeekFields.of(Locale.GERMANY).weekOfYear());
        System.out.println("On the: " + weekOfTheYear + " week of the year!");
        return String.valueOf(weekOfTheYear);
    }

    public static String getBrithdayInfo(String dateOfBirth){
        return getAge(dateOfBirth) + " " + getDayOfTheWeek(dateOfBirth) + " " + getWeekOfTheYear(dateOfBirth);
    }
}
