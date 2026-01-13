package academy.devdojo.maratonajava.javacore.ZZG_Concurrent.service;

import academy.devdojo.maratonajava.javacore.ZZG_Concurrent.domain.Members;

public class EmailDeliveryService implements Runnable {

    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting to deliver emails...");
        while (members.isOpen() || members.pendingEmails() > 0) {
            try {

                String email = members.retrieveEmail();
                if (email == null) continue;

                System.out.println(threadName + " sending email to " + email);
                Thread.sleep(2000);
                System.out.println(threadName + " successully sent mail to " + email);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("All emails are successfully sent!");
    }
}
