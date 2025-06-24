package academy.devdojo.maratonajava.javacore.R_Dates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println("Today: " + now + ", " + dayOfWeek);

        // a próxima ocorrência do dia da semana
        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Próxima ocorrência de tuesday: " + now);

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.TUESDAY));
        System.out.println("Última ocorrência de tuesday: " + now);

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("First day of current month: " + now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last day of current month: " + now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("First day of next month: " + now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfYear());
        System.out.println("First day of current year: " + now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println("First day of next year: " + now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.FRIDAY));
        System.out.println("First friday in month: " + now);
        System.out.println(now.getDayOfWeek());
    }
}
