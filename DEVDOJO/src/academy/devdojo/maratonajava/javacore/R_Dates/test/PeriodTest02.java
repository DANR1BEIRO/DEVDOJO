
package academy.devdojo.maratonajava.javacore.R_Dates.test;

import java.time.LocalDate;
import java.time.Period;


class CalcularTempoFuturo {

    private CalcularTempoFuturo() {
    }

    public static void timeUntil(LocalDate targetDate) {
        LocalDate now = LocalDate.now();

        // O comando throw cria um objeto de exceção e interrompe a execução normal,
        // pulando para o bloco catch.
        try {
            if (targetDate.isBefore(now)) {
                throw new IllegalArgumentException("The date " + targetDate + " is in the past.");
            }
            if (targetDate.isEqual(now)) {
                throw new IllegalArgumentException("The date " + targetDate + " is today.");
            }

            Period period = Period.between(now, targetDate);
            System.out.printf("Time until %s: %d years, %d months and %d days. %n",
                    targetDate, period.getYears(), period.getMonths(), period.getDays());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class PeriodTest02 {
    public static void main(String[] args) {

        LocalDate birth = LocalDate.of(1991, 12, 25);
        LocalDate now = LocalDate.now();
        LocalDate nextBirthDay = LocalDate.of(now.getYear(), 12, 25);

        Period age = Period.between(birth, now);
        Period untilNextBirthDay = Period.between(now, nextBirthDay);

        System.out.printf("Age: %d years, %d months and %d days. %n", age.getYears(), age.getMonths(), age.getDays());
        System.out.printf("Time until next birthday: %d months and %d days. %n", untilNextBirthDay.getMonths(), untilNextBirthDay.getDays());
        System.out.println("Next birthday date: " + now.plus(untilNextBirthDay));

        System.out.println("\nGetting the period until the target date:");

        CalcularTempoFuturo.timeUntil(birth);
        CalcularTempoFuturo.timeUntil(now);
        CalcularTempoFuturo.timeUntil(nextBirthDay);
    }
}


