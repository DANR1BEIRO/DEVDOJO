package academy.devdojo.maratonajava.gerenciamentoDeAssinaturas.entity;

import java.util.List;

public class User {
    private String name;
    private List<Subscription> subscriptionList;

    public User(String name, List<Subscription> subscriptionList) {
        this.name = name;
        this.subscriptionList = subscriptionList;
    }

    public List<Subscription> getSubscriptionList() {
        return subscriptionList;
    }

    public void setSubscriptionList(List<Subscription> subscriptionList) {
        this.subscriptionList = subscriptionList;
    }
}
