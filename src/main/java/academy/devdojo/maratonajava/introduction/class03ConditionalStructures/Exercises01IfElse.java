package academy.devdojo.maratonajava.introduction.class03ConditionalStructures;

/*
How much i have to pay based on annual salary:

* category A: 0 to 34.000 = 9.7%
* category B: 34.001 to 68.500 = 37.35%
* category C: 68.501 and above = 49.50%
* */

public class Exercises01IfElse {
    public static void main(String[] args) {

        double annualSalary = 70000;
        double categoryA = 9.7 / 100;
        double categoryB = 37.35 / 100;
        double categoryC = 49.50 / 100;
        double taxes;

        if(annualSalary <= 34000) {
            taxes = annualSalary * categoryA;
        } else if(annualSalary >= 34001 && annualSalary <= 68000) {
            taxes = annualSalary * categoryB;
        } else {
            taxes = annualSalary * categoryC;
        }

        System.out.printf("Based on my annual salary, i have to pay: " + taxes);
    }
}
