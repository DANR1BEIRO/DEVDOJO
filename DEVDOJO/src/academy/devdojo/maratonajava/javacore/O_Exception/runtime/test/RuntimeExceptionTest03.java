package academy.devdojo.maratonajava.javacore.O_Exception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        openConnection();
    }

    public static String openConnection() {
        try {
            System.out.println("Opening connection");
            System.out.println("Writing to the database");
            return "Connected";
        } catch (Exception e) {
            e.printStackTrace();
        } finally { // o bloco finally SEMPRE será executado
            System.out.println("Closing SO resources");
        }
        return "Not connected";
    }
}


