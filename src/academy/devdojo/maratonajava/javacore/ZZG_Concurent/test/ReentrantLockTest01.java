package academy.devdojo.maratonajava.javacore.ZZG_Concurent.test;

import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable {
    private String name;
    private ReentrantLock lock;

    public Worker(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {

        lock.lock();

        try {
            System.out.printf("Object %s entered a critical session%n", name);
            System.out.printf("%d Threads waiting for the lock%n", lock.getQueueLength());
            System.out.printf("Object %s is going to wait 2s%n", name);
            Thread.sleep(2000);
            System.out.printf("%s Finished the session%n", name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

public class ReentrantLockTest01 {
    static void main() {
        final ReentrantLock lock = new ReentrantLock(true);
        new Thread(new Worker("A", lock)).start();
        new Thread(new Worker("B", lock)).start();
        new Thread(new Worker("C", lock)).start();
        new Thread(new Worker("D", lock)).start();
        new Thread(new Worker("E", lock)).start();
        new Thread(new Worker("F", lock)).start();
        new Thread(new Worker("G", lock)).start();
    }
}
