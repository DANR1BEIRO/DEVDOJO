package academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain;

public class Calculator {

    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void sumTwoNumbersParameter(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);
    }

    public void subtractTwoNumbers() {
        System.out.println(21 - 2);
    }

    public void subtractTwoNumbersParameter(int number1, int number2) {
        int minus = number1 - number2;
        System.out.println(number1 + " minus " + number2 + " is equal to " + minus);
    }

    public void multiplyTwoNumbers(int number1, int number2) {
        int multiply = number1 * number2;
        System.out.println(number1 + " multiply by " + number2 + " is equal to " + multiply);
    }

    public double divideTwoNumbers(double number1, double number2) {
        if (number2 == 0) {
            return 0;
        }
        System.out.print(number1 + " divided by " + number2 + " is equal to ");
        return number1 / number2;
    }

    public void printDivideTwoNumbers(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("Can't divide by zero");
            return;
        }
        System.out.print(number1 + " divided by " + number2 + " is equal to ");
        System.out.println(number1 / number2);
    }

    // method that tries to modify two numbers
    public void modifyTwoNumbers(int number1, int number2) {

        // number1 and number2 are copies of the original photos
        number1 = 99; // modify the copy of the first photo
        number2 = 33; // modify the copy of the second photo

        System.out.println("Inside modifyTwoNumbers");
        System.out.println("Number 1: " + number1 + "\nNumber 2: " + number2);
    }
}
