package academy.devdojo.maratonajava.introduction.class04Loop;

public class Class03Break {
    public static void main(String[] args) {

        int maxCounter = 50;

        for (int i = 1; i <= maxCounter; i++) {
            if (i > 10) {
                System.out.println(i);
                break;
            }
            System.out.println(i);
        }
    }
}
