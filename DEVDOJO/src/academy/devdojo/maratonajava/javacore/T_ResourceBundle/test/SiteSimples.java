package academy.devdojo.maratonajava.javacore.T_ResourceBundle.test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

class SiteView {
    private SiteView() {}


    public static void displayHomePage(Locale locale, Scanner scanner) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);
        String user = UserInput.promptForName("Enter your name: " , scanner);
        String title = bundle.getString("title");
        String welcome = MessageFormat.format(bundle.getString("welcome"), user);
        String cart = bundle.getString("cart");
        String checkout = bundle.getString("checkout");

        System.out.println("===== " + title + " =====");
        System.out.println(welcome);
        System.out.println("[" + cart + "]  [" + checkout + "]");
        System.out.println("=============================");
    }
}

class UserInput {

    private UserInput() {}

    public static Locale selectLanguage(Scanner scanner) {
        System.out.println("Idioms:\n1. Português (BR)\n2. English (US)");
        int option = promptForOption("Enter your language: ", scanner);

        return switch (option) {
            case 1 -> new Locale("pt", "BR");
            case 2 -> new Locale("en", "US");
            default -> Locale.getDefault();
        };
    }

    public static int promptForOption(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                scanner.nextLine();
                if (input < 1 || input > 2) {
                    System.out.println("Invalid option!");
                    continue;
                }
                return input;
            } else {
                System.out.println("Choose one of the two valid options!");
                scanner.nextLine();
            }
        }
    }

    public static String promptForName(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Name can't be empty!");
                continue;
            }
            if (!input.matches("[a-zA-ZÀ-ÿ ]{2,}")) {
                System.out.println("Invalid name! only letters are allowed!");
                continue;
            }
            return input;
        }
    }
}

public class SiteSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale locale = UserInput.selectLanguage(scanner);
        SiteView.displayHomePage(locale, scanner);
        scanner.close();
    }
}
