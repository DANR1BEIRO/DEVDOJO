package academy.devdojo.maratonajava.javacore.B_IntroductionMethods.domain;

import java.security.SecureRandom;
import java.util.stream.IntStream;

public class RollDie {
    static SecureRandom secureRandom = new SecureRandom();

    public static void main(String[] args) {
        System.out.println("Roll dice: " + secureRandom.nextInt(1, 7));
        rollStreamForEach();
        getFrequencyOfEachDieFace();
    }

    private static void rollStreamForEach() {
        IntStream.range(1, 21).forEach(number -> {
            int randomNumber = secureRandom.nextInt(1, 7);
            System.out.print(randomNumber + " ");

            if (number % 5 == 0) {
                System.out.println();
            }
        });
    }

    private static void getFrequencyOfEachDieFace() {
        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;

        for (int i = 1; i <= 10_000_000; i++) {
            int faceRandom = secureRandom.nextInt(1, 7);
            switch (faceRandom) {
                case 1 -> frequency1++;
                case 2 -> frequency2++;
                case 3 -> frequency3++;
                case 4 -> frequency4++;
                case 5 -> frequency5++;
                case 6 -> frequency6++;
            }
        }
        System.out.println("Face\tFrequency");
        System.out.printf("1\t\t%d%n2\t\t%d%n3\t\t%d%n4\t\t%d%n5\t\t%d%n6\t\t%d%n",
                frequency1, frequency2, frequency3, frequency4,
                frequency5, frequency6);
    }
}
