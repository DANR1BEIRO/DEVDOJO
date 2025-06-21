package academy.devdojo.maratonajava.javacore.R_Dates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        LocalDate birth = LocalDate.of(1991, Month.DECEMBER, 25);
        LocalDate now = LocalDate.now();

        System.out.println("Year: " + birth.getYear());
        System.out.println("Month: " + birth.getMonth());
        System.out.println("Day of week: " + birth.getDayOfWeek());
        System.out.println("Day of month: " + birth.getDayOfMonth());
        System.out.println("Is leap year: " + birth.isLeapYear());
        System.out.println("Full birth: " + birth);

        Period age = Period.between(birth, now);
        System.out.println("Age: " + age.getYears() + " years, " +
                age.getMonths() + " months and " + age.getDays() + " days.");
    }
}

/**
 * Introduzida na versão 8 do java
 * Imutável (não pode ser instanciada): Se o valor for alterado, um novo objeto será criado na memória
 */