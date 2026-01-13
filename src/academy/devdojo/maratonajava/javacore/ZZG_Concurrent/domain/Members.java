package academy.devdojo.maratonajava.javacore.ZZG_Concurrent.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean open = true; // basicamente serve para abrir e fechar a classe para receber ou não emails

    public boolean isOpen() {
        return open;
    }

    // checa se existem emails esperando para serem enviados
    public int pendingEmails() {
        lock.lock();
        try {
            return emails.size();
        } finally {
            lock.unlock();
        }
    }

    public void addMemerEmail(String email) {
        lock.lock();
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " added emails in the list");
            this.emails.add(email);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    // quem chamar esse metodo verificará se existe emails
    public String retrieveEmail() throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + " checking if there are emails");

        lock.lock();
        try {
            while (this.emails.size() == 0) { // if there isn't emails, don't stop the method and set the thread to wait
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " there isn't available email. Starting waiting mode...");
                condition.await();
            }
            return this.emails.poll();
        } finally {
            lock.unlock();
        }
    }

    public void close() {
        open = false;
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " notifying everyone that we aren't get emails");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
