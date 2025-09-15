package academy.devdojo.maratonajava.javacore.O_Exception.exception.test;

import academy.devdojo.maratonajava.javacore.O_Exception.exception.domain.LoginInvalidException;

import java.util.Scanner;

public class LoginInvalidExceptionTest01 {
    public static void main(String[] args) {

        try {
            Login();
        } catch (LoginInvalidException e) {
            e.printStackTrace();
        }
    }

    private static void Login() throws LoginInvalidException {
        Scanner scanner = new Scanner(System.in);
        String userNameDB = "Goku";
        String passwordDB = "ssj";

        System.out.print("Username: ");
        String typedUsername = scanner.nextLine();
        System.out.print ("Password: ");
        String typedPassword = scanner.nextLine();

        if (!userNameDB.equals(typedUsername) || !passwordDB.equals(typedPassword)) {
            throw new LoginInvalidException("Username or password is incorrect");
        }
        System.out.println("Login completed!");
    }

}
