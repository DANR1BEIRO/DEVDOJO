package academy.devdojo.maratonajava.gerenciamentoDeAssinaturas.test;

import academy.devdojo.maratonajava.gerenciamentoDeAssinaturas.entity.AnnualSubscription;
import academy.devdojo.maratonajava.gerenciamentoDeAssinaturas.entity.MonthlySubscription;
import academy.devdojo.maratonajava.gerenciamentoDeAssinaturas.entity.Subscription;
import academy.devdojo.maratonajava.gerenciamentoDeAssinaturas.service.SubscriptionManager;
import academy.devdojo.maratonajava.gerenciamentoDeAssinaturas.enums.Plan;
import academy.devdojo.maratonajava.gerenciamentoDeAssinaturas.exception.SubscriptionNotFoundException;

import java.util.List;

public class SubscriptionTest01 {
    static void main() {

        SubscriptionManager manager = new SubscriptionManager();

        Subscription netflix = new MonthlySubscription("Netflix", 25.90, Plan.PREMIUM);
        Subscription amazonPrime = new AnnualSubscription("Prime vídeo", 89.0, Plan.BASIC);

        manager.addSubscription(netflix);
        manager.addSubscription(amazonPrime);

        System.out.println("list activated");
        List<Subscription> active = manager.getActiveSubscriptionsListOldSchool();
        for (Subscription subscription : active) {
            System.out.println(subscription);
        }

        System.out.println("\nSearch for existing subscription");
        try {
            Subscription foundSubscription = manager.findSubscriptionByNameOldSchool("netflix");
            System.out.println("[OK] " + foundSubscription.getName());
        } catch (SubscriptionNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\nGenerate Report (IO)");
        manager.generateReport("subscription_report.txt");
        System.out.println("ok - verify that the file 'subscription_report.txt' has in project root");


    }
}
