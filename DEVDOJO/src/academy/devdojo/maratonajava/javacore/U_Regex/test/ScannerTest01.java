package academy.devdojo.maratonajava.javacore.U_Regex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "Goku, Gohan, Piccollo";
        String[] names = text.split(", ");
        for (String name : names) {
            System.out.println(name.trim());
        }
    }
}
