package academy.devdojo.maratonajava.javacore.K_Enum.test;

import academy.devdojo.maratonajava.javacore.K_Enum.domain.Costumer;
import academy.devdojo.maratonajava.javacore.K_Enum.domain.Costumer.PaymentType;
import academy.devdojo.maratonajava.javacore.K_Enum.domain.CostumerType;

public class CostumerTest01 {
    public static void main(String[] args) {

        Costumer costumer = new Costumer("Vegeta", CostumerType.INDIVIDUAL, PaymentType.DEBIT);
        Costumer costumer2 = new Costumer("Akira", CostumerType.COMPANY, PaymentType.CREDIT);

        System.out.println(costumer);
        System.out.println(costumer2);
    }
}
