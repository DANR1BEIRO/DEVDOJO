package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import academy.devdojo.maratonajava.javacore.Y_Collections.domain.Android;
import academy.devdojo.maratonajava.javacore.Y_Collections.domain.SmartPhone;

public class EqualsTest01 {
    public static void main(String[] args) {

        /**
         * Nos casos em que o equals() não for sobrescrito na classe,
         * ele usará a implementação herdada de Object, que compara se
         * as duas variáveis referenciam exatamente o mesmo objeto em memória (==).
         * Como s1 e s2 foram criados com 'new', eles ocupam posições diferentes
         * na heap, logo equals() retorna false, mesmo que os atributos sejam iguais.
         */

        SmartPhone s1 = new SmartPhone("1ABC", "samsung");
        SmartPhone s2 = new SmartPhone("1ABC", "samsung");

        System.out.println(s1.equals(s2)); // false

        /**
         * Nos casos em que o equals() for sobrescrito na classe,
         * ele irá comparar os atributos definidos na implementacão do metodo (nesse caso foi o 'serial').
         * Portanto, o equals() sobrescrito retornará true se o serial for idêntico; do contrário, false.
         */

        Android android1 = new Android("S18", "18");
        Android android2 = new Android("S18", "18");

        System.out.println(android1.equals(android2)); // true
    }
}
