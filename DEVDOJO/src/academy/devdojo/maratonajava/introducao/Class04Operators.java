package academy.devdojo.maratonajava.introducao;

public class Class04Operators {
    public static void main(String[] args) {
        // + - * /
        int number1 = 50;
        int number2 = 20;
        int sum = number1 + number2;
        int product = number1 * number2;
        int subtraction = number1 - number2;
        int division = number1 / number2;

        System.out.println("Sum: " + (number2 + number1) +
                           "\nProduct: " + product +
                           "\nSubtraction: " + subtraction +
                           "\nDivision: " + division);

        // The % in Java is called the Modulo Operator, and it returns the remainder of a division

        int remainder = 10 % 2;
        System.out.println(remainder); // output 0

        /*
        * Logical Operatores:
        * AND (&&) Return true if both conditions are true
        * OR (||) At least one condition must be true
        * NOT (!) Reverses a Boolean value*/


        /* AND (&&) – Both conditions must be true
        * Imagine a Genin (low-rank ninja) wants to take the Chunin exam. To qualify,
        * they must:
        * 1- Be at least 12 years old
        * 2- Have completed at least 8 missions
        * */
        int age = 13,
            missionsCompleted = 10;

        if (age >= 12 && missionsCompleted >= 8) {
            System.out.println("You can take the Chunin exam!");
        } else {
            System.out.println("You aren't ready yet.");
        }

        /*
        * OR (||) - At least one condition must be true
        * Let's say a ninja can learn the Rasengan if:
        * 1- They are trained by Jiraiya OR
        * 2- They are part of the Uzumaki clan
        * */

        boolean trainedByJiraiya = false,
                isUzumakiClan = true;

        if (trainedByJiraiya || isUzumakiClan) {
            System.out.println("You can learn the Rasengan!");
        } else {
            System.out.println("You can't learn the Rasengan");
        }

        /*
        * NOT (!) - Reverses a Boolean value
        * Madara Uchiha says:
        * "Only those who are not weak can awaken the Mangekyō Sharingan."
        * In Java, we can check if a ninja is NOT weak (!isWeak):
        * */

        boolean isWeak = false;

        if (isWeak) { // if NOT weak
            System.out.println("You can awaken the Mangekyō Sharingan");
        } else {
            System.out.println("You aren't strong enough");
        }

        /*
        * Combining logical Operators
        * Let's say a ninja can unlock sage mode if:
        * 1 - Thet trained on mount Myōboku AND
        * 2 - They have enough chakra OR
        * 3 - They are a reincarnation of Asura
        * */

        boolean trainedOnMountMyoboku = true,
                hasEnoughChakra = false,
                isReincarnationOfAsura = true;

        if (trainedOnMountMyoboku && (hasEnoughChakra || isReincarnationOfAsura)) {
            System.out.println("You can unlock Sage mode");
        } else {
            System.out.println("You can't unlock Sage mode");
        }

    }
}
