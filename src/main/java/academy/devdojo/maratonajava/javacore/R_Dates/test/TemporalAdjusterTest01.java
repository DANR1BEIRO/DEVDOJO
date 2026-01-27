package academy.devdojo.maratonajava.javacore.R_Dates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class NextBusinessDay implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDay = 0;

        switch (dayOfWeek) {
            case FRIDAY:
                addDay = 3;
                break;
            case SATURDAY:
                addDay = 2;
                break;
            default:
                addDay = 1;

        }
        return temporal.plus(addDay, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        System.out.println("Today: "+ now + " - " + now.getDayOfWeek());
        now = LocalDate.now().with(new NextBusinessDay());
        System.out.println("Next business day: "+ now + " - " + now.getDayOfWeek());

        System.out.println("");

        now = LocalDate.now().withDayOfMonth(26);
        System.out.println("Today: "+ now + " - " + now.getDayOfWeek());
        now = LocalDate.now().withDayOfMonth(26).with(new NextBusinessDay());
        System.out.println("Next business day: "+ now + " - " + now.getDayOfWeek());

        System.out.println("");

        now = LocalDate.now().withDayOfMonth(27);
        System.out.println("Today: "+ now + " - " + now.getDayOfWeek());
        now = LocalDate.now().withDayOfMonth(27).with(new NextBusinessDay());
        System.out.println("Next business day: "+ now + " - " + now.getDayOfWeek());

        System.out.println("");

        now = LocalDate.now().withDayOfMonth(30);
        System.out.println("Today: "+ now + " - " + now.getDayOfWeek());
        now = LocalDate.now().withDayOfMonth(30).with(new NextBusinessDay());
        System.out.println("Next business day: "+ now + " - " + now.getDayOfWeek());

    }
}
