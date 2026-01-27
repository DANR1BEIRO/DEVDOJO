package academy.devdojo.maratonajava.javacore.R_Dates.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(23, 11, 11);
        LocalTime timeNow = LocalTime.now();

        System.out.println(timeNow);
        System.out.println("Hour now: " + timeNow.getHour());
        System.out.println("Minute now: " + timeNow.getMinute());
        System.out.println("Second now: " + timeNow.getSecond());
        System.out.println(timeNow.get(ChronoField.HOUR_OF_DAY));

        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
