package academy.devdojo.maratonajava.javacore.O_Exception.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursiveMethod();
        recursiveMethodBaseCase(5);
    }

    public static void recursiveMethod() {
        recursiveMethod();
    }

    public static void recursiveMethodBaseCase(int number) {
        if (number == 0) return;
        recursiveMethodBaseCase(number - 1);
    }
}





