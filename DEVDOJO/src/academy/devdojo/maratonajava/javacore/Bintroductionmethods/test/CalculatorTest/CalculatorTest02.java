package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test.CalculatorTest;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Calculator.Calculator;

public class CalculatorTest02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.multiplyTwoNumbers(10, 20);
        calculator.sumTwoNumbersParameter(80, 5);
        calculator.subtractTwoNumbersParameter(10, 50);
    }
}
