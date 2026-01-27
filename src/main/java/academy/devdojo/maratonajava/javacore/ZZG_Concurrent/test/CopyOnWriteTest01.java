package academy.devdojo.maratonajava.javacore.ZZG_Concurrent.test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class CopyOnWriteTest01 {
    static void main() {
        List<Integer> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Runnable runnableIterator = () -> {
            Iterator<Integer> iterator = list.iterator();
            System.out.println("Thread Iterator: Snapshot taken:");
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Thread Iterator printing snapshot:");
                iterator.forEachRemaining(System.out::println);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable runnableRemover = () -> {
            try {
                TimeUnit.SECONDS.sleep(1); // wait 1 second so the iterator starts first
                for (int i = 0; i < 5; i++) {
                    if (list.remove(Integer.valueOf(i))) {
                        System.out.printf("Thread Remover: %d removed. Current list size: %d%n", i, list.size());
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        new Thread(runnableIterator).start();
        new Thread(runnableRemover).start();
    }
}
