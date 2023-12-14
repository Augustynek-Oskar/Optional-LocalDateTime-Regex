import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Birthday {
    public static void main(String[] args) {

        getDayOfTheWeek("2001-06-17");
    }

    public static int getAge(String dateOfBirth){
        LocalDate localDateNow = LocalDate.now();
        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        Period period = Period.between(birthDate, localDateNow);
        System.out.println(localDateNow.getYear() - birthDate.getYear());
        return localDateNow.getYear() - birthDate.getYear();
    }

    public static DayOfWeek getDayOfTheWeek(String dateOfBirth){
        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        System.out.println(birthDate.getDayOfWeek());
        return birthDate.getDayOfWeek();
    }

    public static void getWeekOfTheYear(String dateOfBirth){
        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        birthDate.
        System.out.println(birthDate.getDayOfWeek());
    }
}
