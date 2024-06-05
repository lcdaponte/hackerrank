import java.time.LocalDate;
import java.util.Calendar;

public class GetDayOfWeek {


    public static String getDay(int month, int day, int year) {
        if(2000 > year || year > 3000){
            throw new RuntimeException("Year outside limits");
        }
        LocalDate localDate = LocalDate.of(year, month, day);


        return localDate.getDayOfWeek().name();
    }
}
