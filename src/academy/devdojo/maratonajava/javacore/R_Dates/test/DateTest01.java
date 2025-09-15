package academy.devdojo.maratonajava.javacore.R_Dates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        // Date works with milliseconds. It stores a long value with the ms since 1970
        Date date = new Date(1749478092612L);
        System.out.println(date);
    }
}
