package academy.devdojo.maratonajava.gerenciamentoDeAssinaturas.entity;

import academy.devdojo.maratonajava.gerenciamentoDeAssinaturas.enums.Plan;

public class MonthlySubscription extends Subscription implements Cancellable {

    public MonthlySubscription(String name, double price, Plan plan) {
        super(name, price, plan);
    }

    @Override
    public void cancel() {
        System.out.println("Cancelling monthly subscription for " + this.getName());
        this.setActive(false);
    }
}
