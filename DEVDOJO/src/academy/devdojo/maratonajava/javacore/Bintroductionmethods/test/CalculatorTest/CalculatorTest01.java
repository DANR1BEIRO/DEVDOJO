package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test.CalculatorTest;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Calculator.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.sumTwoNumbers();
        System.out.println("CalculatorTest01 finished");

        calculator.subtractTwoNumbers();
    }
}

