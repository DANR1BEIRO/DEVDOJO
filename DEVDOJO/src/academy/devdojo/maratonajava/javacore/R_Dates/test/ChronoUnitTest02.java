package academy.devdojo.maratonajava.javacore.R_Dates.test;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

final class SLACalculator {

    private SLACalculator() {
    }

    public static void checkSLA() {

        Locale japan = Locale.JAPAN;
        LocalDateTime arrival = LocalDateTime.of(2025, 6, 24, 12, 30);
        LocalDateTime pickup = LocalDateTime.of(2025, 6, 27, 14, 40);
        long hoursBetween = ChronoUnit.HOURS.between(arrival, pickup);
        final int allowedHours = 48;

        System.out.println("Hours between arrival and pickup: " + hoursBetween);

        if (hoursBetween > allowedHours) {

            long exceededHours = hoursBetween - allowedHours;
            long totalFine = exceededHours * 2;

            NumberFormat currency = NumberFormat.getCurrencyInstance(japan);
            String formattedTotal = currency.format(totalFine);

            System.out.println("SLA exceeded! Penalty hours: " + exceededHours);
            System.out.println("Late penalty (2 yen per hour): " + formattedTotal);
        } else {
            System.out.println("SLA met. No penalty.");
        }
    }
}

public class ChronoUnitTest02 {
    public static void main(String[] args) {
        SLACalculator.checkSLA();
    }
}
