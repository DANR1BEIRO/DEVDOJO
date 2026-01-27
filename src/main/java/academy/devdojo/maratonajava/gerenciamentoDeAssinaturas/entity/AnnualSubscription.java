package academy.devdojo.maratonajava.gerenciamentoDeAssinaturas.entity;

import academy.devdojo.maratonajava.gerenciamentoDeAssinaturas.enums.Plan;

public class AnnualSubscription extends Subscription implements Cancellable {

    public AnnualSubscription(String name, double price, Plan plan) {
        super(name, price, plan);
    }

    @Override
    public void cancel() {
        System.out.println("Cancelling annual subscription for " + this.getName());
        this.setActive(false);
    }
}
