package academy.devdojo.maratonajava.introduction.class04Loop;

public class Class01While_doWhile {
    public static void main(String[] args) {

        int count = 0;

        while(count < 10) {
            System.out.println(++count);
        }

        do {
            System.out.println("inside of do-while");
        } while (count < 10);
    }
}
