package academy.devdojo.maratonajava.javacore.ZZF_Threads.test;

class ThreadExampleRunnable2 implements Runnable {
    private final char c;

    public ThreadExampleRunnable2(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()); // thread main: Chamada assim porque é a que incia o programa
        for (int i = 0; i < 10; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            Thread.yield();
        }
    }
}

public class ThreadTest02 {
    static void main() throws InterruptedException {

        Thread t1 = new Thread(new ThreadExampleRunnable2('A'), "THREAD-01");
        Thread t2 = new Thread(new ThreadExampleRunnable2('B'), "THREAD-02");

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        // Waits for this thread to terminate for up to the given waiting duration
        t1.join();
        t2.start();
    }
}

