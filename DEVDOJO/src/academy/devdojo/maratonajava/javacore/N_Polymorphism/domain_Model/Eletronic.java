package academy.devdojo.maratonajava.javacore.N_Polymorphism.domain_Model;

public class Eletronic extends Product {
    public static final double TAX_PERCENTAGE = 0.21;

    public Eletronic(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating eletronic taxes");
        return price * TAX_PERCENTAGE;
    }
}

