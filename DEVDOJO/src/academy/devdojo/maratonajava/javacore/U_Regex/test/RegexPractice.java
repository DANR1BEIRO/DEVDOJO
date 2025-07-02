package academy.devdojo.maratonajava.javacore.U_Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {
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
        System.out.println("Extrair os números (seguidos) dentro de uma string:");
        String text01 = "O produto custa 45 reais e o frete é 15.";
        String regex01 = "\\d+"; // Um ou mais dígitos

        Pattern pattern01 = Pattern.compile(regex01);
        Matcher matcher01 = pattern01.matcher(text01);
        System.out.println(text01);
        while (matcher01.find()) {
            System.out.println(matcher01.start() + " -> " + matcher01.group());
        }

        System.out.println("\nEncontrar todas as palavras do texto (letras seguidas):");
        String text02 = "Dragon ball GT, Dragon ball Z";
        String regex02 = "\\b\\w+"; // Palavra entre limites

        Pattern pattern02 = Pattern.compile(regex02);
        Matcher matcher02 = pattern02.matcher(text02);
        System.out.println(text02);

        while (matcher02.find()) {
            System.out.println(matcher02.start() + " -> " + matcher02.group());
        }

        System.out.println("\nDetectar e-mail:");
        String text03 = "Contate: goku_macaco@sayajin.com, naruto+9caudas@konoha.com";
        String regex03 = "[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}";

        /**
         * Parte:       | Significado:                      | Exemplo válido:
         * -------------------------------------------------------------------
         * [\\w._%+-]+  | Usuário (nome antes do @)	        | gohan.son_2025
         * -------------------------------------------------------------------
         * @	        | Separador	                        | @
         * -------------------------------------------------------------------
         * [\\w.-]+	    | Domínio	                        | gmail, empresa-1
         * -------------------------------------------------------------------
         * \\.	        | Ponto entre domínio e extensão	| .
         * -------------------------------------------------------------------
         * [a-zA-Z]{2,}	| Extensão com 2 ou mais letras	    | com, org, br
         */

        Pattern pattern03 = Pattern.compile(regex03);
        Matcher matcher03 = pattern03.matcher(text03);
        System.out.println(text03);

        while (matcher03.find()) {
            System.out.println(matcher03.start() + " -> " + matcher03.group());
        }

        System.out.println("\nTudo que não for letra:");
        String text04 = "abcd123! @#efg";
        String regex04 = "[^a-zA-Z]";

        Pattern pattern04 = Pattern.compile(regex04);
        Matcher matcher04 = pattern04.matcher(text04);
        System.out.println(text04);

        while (matcher04.find()) {
            System.out.println(matcher04.start() + " -> " + matcher04.group());
        }

        System.out.println("\nValidação de CPF:");
        String[] cpfs = {
                "123.456.789-003",
                "1233.456.324-18",
                "006.476.743-23",
                "724.810.89-008",
                "123.456.789-00"};

        String regex05 = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        Pattern pattern05 = Pattern.compile(regex05);

        for (String cpf : cpfs) {
            Matcher matcher05 = pattern05.matcher(cpf);
            if (matcher05.matches()) {
                System.out.println("CPF válido: " + cpf);
            } else {
                System.out.println("CPF inválido: " + cpf);
            }

        }


    }
}
