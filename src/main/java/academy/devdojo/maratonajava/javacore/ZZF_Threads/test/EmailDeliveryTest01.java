package academy.devdojo.maratonajava.javacore.ZZF_Threads.test;

import academy.devdojo.maratonajava.javacore.ZZF_Threads.domain.Members;
import academy.devdojo.maratonajava.javacore.ZZF_Threads.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    static void main() {
        Members members = new Members();
        Thread jiraya = new Thread(new EmailDeliveryService(members), "Jiraya");
        Thread kakashi = new Thread(new EmailDeliveryService(members), "Kakashi");

        jiraya.start();
        kakashi.start();

        while (true) {
            String email = JOptionPane.showInputDialog("Enter your email");
            if (email == null || email.isEmpty()) {
                members.close();
                break;
            }
            members.addMemerEmail(email);
        }
    }
}
