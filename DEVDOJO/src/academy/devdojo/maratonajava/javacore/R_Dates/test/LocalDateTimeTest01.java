package academy.devdojo.maratonajava.javacore.R_Dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate date = LocalDate.parse("2025-10-01");
        System.out.println(date);

        LocalTime time = LocalTime.parse("10:01:01");
        System.out.println(time);

        LocalDateTime ldt01 = date.atTime(time);
        LocalDateTime ldt02 = time.atDate(date);

        System.out.println(ldt01);
        System.out.println(ldt02);
    }
}
