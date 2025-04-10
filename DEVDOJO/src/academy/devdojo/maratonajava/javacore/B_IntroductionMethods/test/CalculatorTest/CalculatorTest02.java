package academy.devdojo.maratonajava.javacore.B_IntroductionMethods.test.CalculatorTest;

import academy.devdojo.maratonajava.javacore.B_IntroductionMethods.domain.Calculator.Calculator;

public class CalculatorTest02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.multiplyTwoNumbers(10, 20);
        calculator.sumTwoNumbersParameter(80, 5);
        calculator.subtractTwoNumbersParameter(10, 50);
    }
}
