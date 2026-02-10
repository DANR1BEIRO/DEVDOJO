package academy.devdojo.maratonajava.javacore.B_IntroductionMethods.domain;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class JoKenPo {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static SecureRandom secureRandom = new SecureRandom();

    private enum Status {WON, LOSES, DRAW}

    public static void main(String[] args) throws InterruptedException {
        go();
    }

    private static void go() throws InterruptedException {
        Status result;
        do {
            menu();
            int userOption = Integer.parseInt(SCANNER.nextLine());
            if (userOption == 0) {
                System.out.println("Exiting...");
                TimeUnit.SECONDS.sleep(1);
                break;
            }

            int computerOption = secureRandom.nextInt(1, 4);

            System.out.printf("You chose: %s%nComputer chose: %s%n",
                    JoKenPoOption.fromInt(userOption),
                    JoKenPoOption.fromInt(computerOption));

            result = checkWhoWon(userOption, computerOption);
            System.out.println("Result: " + result);

            if (result == Status.DRAW) {
                System.out.println("Let's try again");
            }
        } while (result == Status.DRAW);
    }

    private static void menu() {
        System.out.println("Type your choice");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.println("0. exit");
    }
    private static Status checkWhoWon(int user, int computer) {
        if (user == computer) {
            return Status.DRAW;
        }

        return switch (user) {
            case 1 -> (computer == 3) ? Status.WON : Status.LOSES;
            case 2 -> (computer == 1) ? Status.WON : Status.LOSES;
            case 3 -> (computer == 2) ? Status.WON : Status.LOSES;
            default -> Status.LOSES;
        };
    }
}
