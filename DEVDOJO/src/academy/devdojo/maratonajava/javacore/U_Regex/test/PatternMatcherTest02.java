package academy.devdojo.maratonajava.javacore.U_Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        /**
         * Meta caracteres:
         * \d - Todos os dígitos (1-9)
         * \D - Tudo que não for dígito
         * \s - Todos os espaços em branco \t \n \f \r
         * \S - Todos os caracteres, excluindo os brancos
         * \w - a-ZA-Z, dígitos(1-9), _
         * \W - Tudo o que não for incluso no \w
         */
        String regex = "\\W";
        String text01 = "abaaba";
        String text02 = "aZ1 2_3#@";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text02);

        System.out.println("Text:   " + text02);
        System.out.println("Index:  0123456789");
        System.out.println("Regex: " + regex);

        System.out.println("Posições encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
