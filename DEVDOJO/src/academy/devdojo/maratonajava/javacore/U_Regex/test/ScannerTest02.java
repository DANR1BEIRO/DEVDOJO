package academy.devdojo.maratonajava.javacore.U_Regex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String text = "Goku, Gohan, Piccollo, true, false, 300";
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(", ");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("int: " + i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("boolean: " + b);
            } else {
                System.out.println(scanner.next().trim());
            }
        }
    }
}
