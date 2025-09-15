package academy.devdojo.maratonajava.javacore.N_Polymorphism.domain_Model;

public abstract class Product implements Taxable {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
