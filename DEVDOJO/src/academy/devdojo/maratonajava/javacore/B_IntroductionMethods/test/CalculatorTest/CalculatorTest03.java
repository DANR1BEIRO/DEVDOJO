package academy.devdojo.maratonajava.javacore.B_IntroductionMethods.test.CalculatorTest;

import academy.devdojo.maratonajava.javacore.B_IntroductionMethods.domain.Calculator.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator3 = new Calculator();

        double result = calculator3.divideTwoNumbers(50, 2);
        System.out.println(result);
        System.out.println("----------------");
        calculator3.printDivideTwoNumbers(90, 50);
    }
}
