package academy.devdojo.maratonajava.javacore.ZZF_Threads.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true; // basicamente serve para abrir e fechar a classe para receber ou não emails

    public boolean isOpen() {
        return open;
    }

    // checa se existem emails esperando para serem enviados
    public int pendingEmails() {
        synchronized (this.emails) { // sincronizar um objeto significa que duas Threads não podem acessá-lo ao mesmo tempo
            return emails.size();
        }
    }

    public void addMemerEmail(String email) {
        synchronized (this.emails) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " added emails in the list");
            this.emails.add(email);
            this.emails.notifyAll(); // wakes up all threads that are waiting
        }
    }

    // quem chamar esse metodo verificará se existe emails
    public String retrieveEmail() throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + " checking if there are emails");

        synchronized (this.emails) {
            while (this.emails.size() == 0) { // if there isn't emails, don't stop the method and set the thread to wait
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " there isn't available email. Starting waiting mode...");

                // The wait method can be called only when the thread already had the lock, i.e., inside a synchronized block
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void close() {
        open = false;
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " notifying everyone that we aren't get emails");
        }

    }
}
