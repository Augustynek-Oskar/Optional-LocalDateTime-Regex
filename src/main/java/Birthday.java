import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Birthday {
    public static void main(String[] args) {
        getAge("2001-06-17");
    }

    public static int getAge(String dateOfBirth){
        LocalDate localDateNow = LocalDate.now();
        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        Period period = Period.between(birthDate, localDateNow);
        System.out.println(localDateNow.getYear() - birthDate.getYear());
        return localDateNow.getYear() - birthDate.getYear();
    }

}
