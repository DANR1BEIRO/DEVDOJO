package academy.devdojo.maratonajava.javacore.N_Polymorphism.test;

import academy.devdojo.maratonajava.javacore.N_Polymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.N_Polymorphism.domain.Tomato;
import academy.devdojo.maratonajava.javacore.N_Polymorphism.service.ProductTaxReport;

public class ProductTest01 {
    public static void main(String[] args) {

        Computer computer = new Computer("Brainiac", 10000);
        Tomato tomato = new Tomato("Italian", 6);
        ProductTaxReport.generateComputerTaxReport(computer);
        System.out.println("______________________________");
        ProductTaxReport.generateTomatoTaxReport(tomato);
    }
}
