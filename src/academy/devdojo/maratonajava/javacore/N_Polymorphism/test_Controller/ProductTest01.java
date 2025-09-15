package academy.devdojo.maratonajava.javacore.N_Polymorphism.test_Controller;

import academy.devdojo.maratonajava.javacore.N_Polymorphism.domain_Model.Computer;
import academy.devdojo.maratonajava.javacore.N_Polymorphism.domain_Model.Product;
import academy.devdojo.maratonajava.javacore.N_Polymorphism.domain_Model.Tomato;
import academy.devdojo.maratonajava.javacore.N_Polymorphism.domain_Model.VideoGame;
import academy.devdojo.maratonajava.javacore.N_Polymorphism.service_View.ProductTaxReport;

public class ProductTest01 {
    public static void main(String[] args) {

        Computer computer = new Computer("Brainiac", 10000);
        Tomato tomato = new Tomato("Italian", 6);
        ProductTaxReport.generateProductTaxReport(computer);
        System.out.println("______________________________");
        ProductTaxReport.generateProductTaxReport(tomato);

        /**
         * A list of Product references, each pointing to a different kind of product
         */
        Product[] products = {
                new Computer("Brainiac", 1000),
                new Tomato("Italian", 6),
                new VideoGame("Nintendo Switch", 2000)
        };

        for (Product product : products) {
            System.out.println("_________________________");
            System.out.println("Inside the for loop through the list of products");
            ProductTaxReport.generateProductTaxReport(product);
        }
    }
}
