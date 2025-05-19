package academy.devdojo.maratonajava.javacore.N_Polymorphism.service_View;

import academy.devdojo.maratonajava.javacore.N_Polymorphism.domain_Model.Computer;
import academy.devdojo.maratonajava.javacore.N_Polymorphism.domain_Model.Product;
import academy.devdojo.maratonajava.javacore.N_Polymorphism.domain_Model.Tomato;

public class ProductTaxReport {

    public static void generateProductTaxReport(Product product) {
        System.out.println("Starting the report for product");
        double taxValue = product.calculateTaxValue();
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Taxes: " + taxValue);
        if (product instanceof Tomato) {
            String bestBefore = ((Tomato) product).getBestBefore();
            System.out.println(bestBefore);
        }
    }
}

/**
 * Added a new method that takes a superclass reference as a parameter
 * to accept a subclass object
 */