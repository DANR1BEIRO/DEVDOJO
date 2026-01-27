package academy.devdojo.maratonajava.javacore.K_Enum.test;

import academy.devdojo.maratonajava.javacore.K_Enum.domain.Costumer;
import academy.devdojo.maratonajava.javacore.K_Enum.domain.CostumerType;
import academy.devdojo.maratonajava.javacore.K_Enum.domain.PaymentType;

public class CostumerTest01 {
    public static void main(String[] args) {

        Costumer costumer = new Costumer("Tetsuo", CostumerType.INDIVIDUAL, PaymentType.DEBIT);
        Costumer costumer2 = new Costumer("Kaneda", CostumerType.COMPANY, PaymentType.CREDIT);

        System.out.println(costumer);
        System.out.println(costumer2);

        System.out.println("The discount for debit payments is: " + PaymentType.DEBIT.calculateDiscount(100) + "%");
        System.out.println("The discount for credit payments is: " + PaymentType.CREDIT.calculateDiscount(100) + "%");
    }
}
