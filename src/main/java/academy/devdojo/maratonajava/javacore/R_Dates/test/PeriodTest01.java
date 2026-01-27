package academy.devdojo.maratonajava.javacore.R_Dates.test;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);

        Period period = Period.between(now, nowAfterTwoYears);
        System.out.println(period);
    }
}
