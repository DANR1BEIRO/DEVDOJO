package academy.devdojo.maratonajava.javacore.U_Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
        String text01 = "abaaba";
        String text02 = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text02);

        System.out.println("Text:   " + text02);
        System.out.println("Index:  0123456789");
        System.out.println("Regex: " + regex);

        System.out.println("Posições encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}
