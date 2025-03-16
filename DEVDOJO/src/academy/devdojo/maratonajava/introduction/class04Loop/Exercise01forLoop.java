package academy.devdojo.maratonajava.introduction.class04Loop;

// Displays all even number from 1 to 200 using loop

public class Exercise01forLoop {
    public static void main(String[] args) {

        for (int i = 0; i <= 200 ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
