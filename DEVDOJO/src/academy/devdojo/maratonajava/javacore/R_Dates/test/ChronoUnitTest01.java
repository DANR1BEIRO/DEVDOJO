package academy.devdojo.maratonajava.javacore.R_Dates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {

        LocalDateTime birthday = LocalDateTime.of(1991, Month.DECEMBER, 25,0,0,0);
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Seconds: "+ ChronoUnit.SECONDS.between(birthday, now));
        System.out.println("Minutes: "+ ChronoUnit.MINUTES.between(birthday, now));
        System.out.println("Hours: "+ ChronoUnit.HOURS.between(birthday, now));
        System.out.println("Days: "+ ChronoUnit.DAYS.between(birthday, now));
        System.out.println("Weeks: "+ ChronoUnit.WEEKS.between(birthday, now));
        System.out.println("Months: "+ ChronoUnit.MONTHS.between(birthday, now));
        System.out.println("Years: "+ ChronoUnit.YEARS.between(birthday, now));
        System.out.println("Decades: "+ ChronoUnit.DECADES.between(birthday, now));
        System.out.println("Centuries: "+ ChronoUnit.CENTURIES.between(birthday, now));
    }
}
