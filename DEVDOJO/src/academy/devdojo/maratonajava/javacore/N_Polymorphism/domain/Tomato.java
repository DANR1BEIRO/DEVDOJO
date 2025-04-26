package academy.devdojo.maratonajava.javacore.N_Polymorphism.domain;

public class Tomato extends Product {
    public static final double TAX_PERCENTAGE = 0.06;
    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxValue() {
        return this.price * TAX_PERCENTAGE;
    }
}
