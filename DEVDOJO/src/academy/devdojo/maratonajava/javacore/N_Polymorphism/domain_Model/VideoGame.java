package academy.devdojo.maratonajava.javacore.N_Polymorphism.domain_Model;

public class VideoGame extends Product {
    public static final double TAX_PERCENTAGE = 0.21;

    public VideoGame(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating video game taxes");
        return price * TAX_PERCENTAGE;
    }
}
