package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import academy.devdojo.maratonajava.javacore.Y_Collections.domain.SmartPhone;

public class EqualsTest01 {
    public static void main(String[] args) {

        SmartPhone s1 = new SmartPhone("1ABC", "samsung");
        SmartPhone s2 = new SmartPhone("1ABC", "samsung");

        /**
         * Nos casos em que o equals() não for sobrescrito na classe,
         * ele usará a implementação herdada de Object, que compara se
         * as duas variáveis referenciam exatamente o mesmo objeto em memória (==).
         * Como s1 e s2 foram criados com 'new', eles ocupam posições diferentes
         * na heap, logo equals() retorna false, mesmo que os atributos sejam iguais.
         */


        System.out.println(s1.equals(s2)); // false


    }
}
