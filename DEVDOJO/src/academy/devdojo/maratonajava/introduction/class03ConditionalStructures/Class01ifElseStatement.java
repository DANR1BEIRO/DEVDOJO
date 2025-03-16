package academy.devdojo.maratonajava.introduction.class03ConditionalStructures;

public class Class01ifElseStatement {
    public static void main(String[] args) {

        // if-else statement
        // if (condition) {code}

        int age = 100  ;
        boolean isAllowedToBuyAlcohol = age >= 18;

        if (isAllowedToBuyAlcohol) {
            System.out.println("if statement true: Can purchase alcoholic drinks");
        } else {
            System.out.println("if statement false: Can´t purchase alcoholic drinks");
        }
    }
}
