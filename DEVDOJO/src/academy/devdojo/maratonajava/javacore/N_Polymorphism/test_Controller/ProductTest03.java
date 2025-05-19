package academy.devdojo.maratonajava.javacore.N_Polymorphism.test_Controller;

import academy.devdojo.maratonajava.javacore.N_Polymorphism.domain_Model.Computer;
import academy.devdojo.maratonajava.javacore.N_Polymorphism.domain_Model.Product;
import academy.devdojo.maratonajava.javacore.N_Polymorphism.domain_Model.Tomato;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen", 3000);

        Tomato tomato = new Tomato("Sicilian", 20);
        tomato.setBestBefore("11/12/2021");


    }
}
