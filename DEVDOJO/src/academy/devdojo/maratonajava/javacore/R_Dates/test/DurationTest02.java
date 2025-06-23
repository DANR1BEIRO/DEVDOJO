package academy.devdojo.maratonajava.javacore.R_Dates.test;

import java.time.Duration;

public class DurationTest02 {
    public static void main(String[] args) {

        Duration duration = Duration
                .ofHours(3)
                .plusMinutes(45)
                .plusSeconds(30)
                .plusMillis(500);

        System.out.println("Total seconds: " + duration.toSeconds());

        System.out.println("Fraction of nanoseconds: " + duration.getNano());
        System.out.println("Total nanoseconds: " + duration.toNanos());

        long minutes = duration.toMinutes();
        System.out.println("Total minutes: " + minutes);

        long milliseconds = duration.toMillis();
        System.out.println("Total milliseconds: " + milliseconds);

    }
}
