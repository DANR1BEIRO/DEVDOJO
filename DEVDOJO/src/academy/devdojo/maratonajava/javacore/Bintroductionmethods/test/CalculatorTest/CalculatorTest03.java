package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test.CalculatorTest;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Calculator.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator3 = new Calculator();

        double result = calculator3.divideTwoNumbers(50, 2);
        System.out.println(result);
        System.out.println("----------------");
        calculator3.printDivideTwoNumbers(90, 50);
    }
}
