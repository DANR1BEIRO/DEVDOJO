package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator3 = new Calculator();

        double result = calculator3.divideTwoNumbers(50,0);
        System.out.println(result);
    }
}
