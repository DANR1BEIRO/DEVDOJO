package academy.devdojo.maratonajava.javacore.ZZG_Concurrent.test;

// Usage example, based on a typical producer-consumer scenario. Note that a BlockingQueue can safely
// be used with multiple producers and multiple consumers

import java.util.concurrent.*;

class Producer implements Runnable {
    private final BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(500);

                Integer number = produce();
                System.out.printf("Producer generated: %d%n", number);
                queue.put(number);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    Integer produce() {
        return ThreadLocalRandom.current().nextInt(1, 50);
    }
}

class Consumer implements Runnable {
    private final BlockingQueue<Integer> queue;
    private final String name;

    public Consumer(BlockingQueue<Integer> queue, String name) {
        this.queue = queue;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            while (true) {
             Integer number = queue.take();
             consume(number);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void consume(Integer x) {
        System.out.printf("Consumer %s processed: %d%n", name, x);
    }
}

public class BlockingQueueTest02 {
    static void main() {
        BlockingQueue<Integer> q = new LinkedBlockingQueue<>(2);
        Producer p = new Producer(q);
        Consumer c1 = new Consumer(q, "A");
        Consumer c2 = new Consumer(q, "B");

        new Thread(p).start();
        new Thread(c1).start();
        new Thread(c2).start();
    }
}

/**
 * O Produtor enche a fila, bloqueia (espera espaço). O Consumidor esvazia, bloqueia (espera dados)
 */
