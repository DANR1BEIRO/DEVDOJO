package academy.devdojo.maratonajava.javacore.B_IntroductionMethods.test.CalculatorTest;

import academy.devdojo.maratonajava.javacore.B_IntroductionMethods.domain.Calculator.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.sumTwoNumbers();
        System.out.println("CalculatorTest01 finished");

        calculator.subtractTwoNumbers();
    }
}

