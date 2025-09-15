package academy.devdojo.maratonajava.javacore.B_IntroductionMethods.test.CalculatorTest;

import academy.devdojo.maratonajava.javacore.B_IntroductionMethods.domain.Calculator.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        Calculator calculator4 = new Calculator();

        int a = 1; // original photo number 1
        int b = 2; // original photo number 2

        // give the photo copies to the method
        calculator4.modifyTwoNumbers(a, b);

        System.out.println("Inside CalculatorTest04");
        System.out.println("Number 1: " + a + "\nNumber 2: " + b);
    }
}
