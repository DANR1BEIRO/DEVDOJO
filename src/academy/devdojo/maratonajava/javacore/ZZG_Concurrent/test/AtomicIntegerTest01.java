package academy.devdojo.maratonajava.javacore.ZZG_Concurent.test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * AtomicInteger
 * uses a Compare-And-Swap (CAS) operation internally to perform thread-safe
 * updates to a single integer value without using explicit locks. The core
 * method is compareAndSet(), which is a hardware-level atomic instruction that
 * ensures the check and act operations happen in a single, uninterruptible step
 */

class Counter {
    private int count;
    private AtomicInteger atomicInteger = new AtomicInteger();
    private final Lock lock = new ReentrantLock(true);

    void increment() {
        lock.lock();
        try {
            count++;
            atomicInteger.incrementAndGet();
        } finally {
            lock.unlock();
        }
    }

    int getCount() {
        return count;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}

public class AtomicIntegerTest01 {
    static void main() throws InterruptedException {
        Counter counter = new Counter();
        Runnable runnable = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(counter.getCount());
        System.out.println(counter.getAtomicInteger());
    }
}
