package academy.devdojo.maratonajava.introduction.class04Loop;

/*
* Calculate the installment options for a car, ensuring that each
* payment is at least $1.000
* */

public class Exercise02Break {
    public static void main(String[] args) {
        double carPrice = 10000;
        for (int installment = 1; installment <= carPrice ; installment++) {
            double installmentAmount = carPrice / installment;
            if (installmentAmount < 1000){
                break;
            }
             System.out.printf("Installment %d: $%.2f\n", installment, installmentAmount);
        }
    }
}
