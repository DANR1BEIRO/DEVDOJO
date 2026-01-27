package academy.devdojo.maratonajava.javacore.U_Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        /**
         * Meta caracteres:
         * \d - Todos os dígitos (1-9)
         * \D - Tudo que não for dígito
         * \s - Todos os espaços em branco \t \n \f \r
         * \S - Todos os caracteres, excluindo os brancos
         * \w - a-zA-Z, dígitos(1-9), _
         * \W - Tudo o que não for incluso no \w
         * [] - range
         * ?  - zero ou uma
         * * (asterisco) - zero ou mais
         * +  - uma ou mais
         * {n,m} - de n até m
         * () - agrupamento
         * | - ou
         * $ - fim da linha
         */
        String regex = "0[xX]([\\da-fA-F])+(\\s|$)";
        String text = "12 0x 0X 0xFFABC 0x10G 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Text:   " + text);
        System.out.println("Regex: " + regex);

        System.out.println("Posições encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
