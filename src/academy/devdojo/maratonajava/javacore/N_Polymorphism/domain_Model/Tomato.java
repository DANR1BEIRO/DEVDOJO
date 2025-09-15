package academy.devdojo.maratonajava.javacore.N_Polymorphism.domain_Model;

public class Tomato extends Product {

    public static final double TAX_PERCENTAGE = 0.06;
    private String bestBefore;

    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating tomato taxes");
        return this.price * TAX_PERCENTAGE;
    }

    public String getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(String bestBefore) {
        this.bestBefore = bestBefore;
    }
}
