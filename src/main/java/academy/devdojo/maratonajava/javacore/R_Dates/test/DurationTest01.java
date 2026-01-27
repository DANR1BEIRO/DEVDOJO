package academy.devdojo.maratonajava.javacore.R_Dates.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(10);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7).minusMinutes(1);

        Duration between1 = Duration.between(now, nowAfterTwoYears);
        Duration between2 = Duration.between(timeMinus7Hours, timeNow);

        System.out.println(between1);
        System.out.println(between2);

        System.out.println(Duration.ofHours(1).getSeconds());
    }
}
