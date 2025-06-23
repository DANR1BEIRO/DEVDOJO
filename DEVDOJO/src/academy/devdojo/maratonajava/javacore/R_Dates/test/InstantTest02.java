package academy.devdojo.maratonajava.javacore.R_Dates.test;

import java.time.Duration;
import java.time.Instant;

public class InstantTest02 {
    public static void main(String[] args) {
        try {
            Instant start = Instant.now();

            System.out.println("Finishing the application...");
            Thread.sleep(10000);
            System.out.println("... application finished!");

            Instant finish = Instant.now();

            Duration time = Duration.between(start, finish);

            System.out.println("Elapsed time in seconds: " + time.getSeconds());
            System.out.println("Elapsed time in nanoseconds: " + time.getNano());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
