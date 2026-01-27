package academy.devdojo.maratonajava.javacore.ZZG_Concurrent.test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest01 {
    private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    private static void beeper() {
        Runnable r = () -> {
            System.out.println(LocalTime.now().format(formatter) + " beep");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        // Executor.schedule roda apenas uma vez
        // executor.schedule(r, 2, TimeUnit.SECONDS);

        // executa a partir do tempo estipulado, não levando em consideracao outros eventos
        ScheduledFuture<?> scheduledFuture = executor.scheduleAtFixedRate(r, 1, 2, TimeUnit.SECONDS);

        // executa depois que a Thread acorda
        ScheduledFuture<?> scheduledFuture1 = executor.scheduleWithFixedDelay(r, 1, 2, TimeUnit.SECONDS);

        executor.schedule(() -> {
            System.out.println("Finalizado");
            scheduledFuture1.cancel(false);
            executor.shutdown();
        }, 10, TimeUnit.SECONDS);
    }

    static void main() {
        System.out.println(LocalDateTime.now().format(formatter));
        beeper();
    }
}
