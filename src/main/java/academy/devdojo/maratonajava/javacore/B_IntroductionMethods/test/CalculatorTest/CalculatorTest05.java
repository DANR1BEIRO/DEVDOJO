package academy.devdojo.maratonajava.javacore.B_IntroductionMethods.test.CalculatorTest;

import academy.devdojo.maratonajava.javacore.B_IntroductionMethods.domain.Calculator.Calculator;

public class CalculatorTest05 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        Calculator calculator = new Calculator();

        calculator.sumArrays(arr);
        calculator.sumVarArgs(1, 2, 3, 4, 5);
    }
}
