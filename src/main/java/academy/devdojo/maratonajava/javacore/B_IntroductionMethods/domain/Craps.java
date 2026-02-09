package academy.devdojo.maratonajava.javacore.B_IntroductionMethods.domain;

import java.security.SecureRandom;

/**
 * You roll two dice. Each die has six faces, which contain one, two, three, four, five and
 * six spots, respectively. After the dice have come to rest, the sum of the spots on the two
 * upward faces is calculated. If the sum is 7 or 11 on the first throw, you win. If the sum
 * is 2, 3 or 12 on the first throw (called “craps”), you lose (i.e., the “house” wins). If the
 * sum is 4, 5, 6, 8, 9 or 10 on the first throw, that sum becomes your “point.” To win,
 * you must continue rolling the dice until you “make your point” (i.e., roll that same
 * point value). You lose by rolling a 7 before making your point.
 */

public class Craps {
    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {CONTINUE, WON, LOST}

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        go();
    }

    private static void go() {
        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN, YO_LEVEN -> gameStatus = Status.WON;
            case SNAKE_EYES, TREY, BOX_CARS -> gameStatus = Status.LOST;
            default -> {
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is: %d%n", myPoint);
            }
        }

        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();

            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;
            }
            if (sumOfDice == SEVEN) {
                gameStatus = Status.LOST;
            }
        }

        if (gameStatus == Status.WON) {
            System.out.println("Player wins");
        } else {
            System.out.println("Player loses");
        }
    }

    private static int rollDice() {
        int die1 = randomNumbers.nextInt(1, 7);
        int die2 = randomNumbers.nextInt(1, 7);
        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }
}
