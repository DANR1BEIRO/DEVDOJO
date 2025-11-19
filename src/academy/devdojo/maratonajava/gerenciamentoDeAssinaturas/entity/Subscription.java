package academy.devdojo.maratonajava.gerenciamentoDeAssinaturas.entity;

import academy.devdojo.maratonajava.gerenciamentoDeAssinaturas.enums.Plan;

import java.time.LocalDate;

public abstract class Subscription {
    private String name;
    private double price;
    private LocalDate startDate;
    private Plan plan;
    private boolean active;

    public Subscription(String name, double price, Plan plan) {
        this.name = name;
        this.price = price;
        this.plan = plan;
        this.startDate = LocalDate.now();
        this.active = true;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Plan getPlan() {
        return plan;
    }

    @Override
    public String toString() {
        return String.format("Service: %s | Plan: %s | Price: $%.2f | Active: %s", name, plan, price, active);
    }
}
