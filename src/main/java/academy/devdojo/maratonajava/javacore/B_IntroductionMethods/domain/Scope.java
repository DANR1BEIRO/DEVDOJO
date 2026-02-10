package academy.devdojo.maratonajava.javacore.B_IntroductionMethods.domain;

public class Scope {
    private static int x = 5;

    public static void main(String[] args) {
        useLocalVariable();
        useFieldVariable();
    }

    static void useLocalVariable() {
        int x = 25;
        System.out.printf("Local variable entering method useLocalVariable is %d%n", x);
        x++;
        System.out.printf("Local variable before exiting method useLocalVariable is %d%n", x);
    }

    static void useFieldVariable() {
        System.out.printf("Field variable entering method useFieldVariable is %d%n", x);
        x++;
        System.out.printf("Field variable before exiting method useFieldVariable is %d%n", x);
    }
}
