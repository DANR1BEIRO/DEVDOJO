package academy.devdojo.maratonajava.javacore.R_Dates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        /**
         * Since the Calendar class is abstract, it is impossible to create an instance of it directly.
         * You must use Calendar.getInstance() to obtain a concrete implementation.
         */
        Calendar c = Calendar.getInstance();

        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Sunday is the first day of the week");
        }

        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));

        c.roll(Calendar.DAY_OF_MONTH, 20);
        c.add(Calendar.HOUR, 50);

        Date date = c.getTime();
        System.out.println(date);
    }
}