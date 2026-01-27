package academy.devdojo.maratonajava.javacore.F_StaticModifier.domain;

public class Calculator {

    public static void sum(double number1, double number2) {
        double sum = number1 + number2;
        System.out.printf("The sum of %.2f and %.2f is equal to %.2f\n", number1, number2, sum);
    }

    public static void subtract(double number1, double number2) {
        System.out.println("The subtract is: " + (number1 - number2));
    }

    public static void multiply(double n1, double n2) {
        double product = n1 * n2;
        System.out.printf("%.2f multiply by %.2f equals: %.2f", n1, n2, product);
        System.out.println("");
    }

    public static void divide(double n1, double n2) {
        double result = n1 / n2;
        if (n1 == 0) {
            System.out.println("Can't divide by zero");
        } else {
            System.out.printf("%.2f divided by %.2f equals: %.4f", n1, n2, result);
        }
    }
}
