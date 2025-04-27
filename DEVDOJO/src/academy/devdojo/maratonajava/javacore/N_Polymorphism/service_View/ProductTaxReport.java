package academy.devdojo.maratonajava.javacore.N_Polymorphism.service_View;

import academy.devdojo.maratonajava.javacore.N_Polymorphism.domain_Model.Computer;
import academy.devdojo.maratonajava.javacore.N_Polymorphism.domain_Model.Tomato;

public class  ProductTaxReport {

    public static void generateComputerTaxReport(Computer computer) {
        System.out.println("Starting the report for computer");
        double taxValue = computer.calculateTaxValue();
        System.out.println("Computer: " + computer.getName());
        System.out.println("Price: " + computer.getPrice());
        System.out.println("Tax Value: " + taxValue);
    }

    public static void generateTomatoTaxReport(Tomato tomato) {
        System.out.println("Starting the report for tomato");
        double taxValue = tomato.calculateTaxValue();
        System.out.println("Tomato: " + tomato.getName());
        System.out.println("Price: " + tomato.getPrice());
        System.out.println("Tax Value: " + taxValue);
    }
}
