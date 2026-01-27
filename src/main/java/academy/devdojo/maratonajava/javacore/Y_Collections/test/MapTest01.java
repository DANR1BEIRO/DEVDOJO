package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    static void main() {
        /**
         * Map sempre precisará da declaração de tipo da chave e do valor
         * 'Map<key, value>'
         * Map não permite chaves duplicadas
         */
        Map<String, String> map = new LinkedHashMap<>(); // LinkedHashMap mantém a ordem de inserção
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        // putIfAbsent: adiciona ao map apenas se a chave não existir
        // put: sobrescreve o elemento caso a chave seja igual
        map.putIfAbsent("vc", "você");
        System.out.println(map);

        /**
         * Dentro do Map existe o metodo keySet(). Como as chaves não
         * podem ser duplicadas, logo elas formam um Set.
         * Já o values() retorna uma Collection, portanto
         * permite elementos duplicados.
         */
        for (String key : map.keySet()) {
            // map.get(key): retorna o valor associado à chave passada como argumento
            System.out.println(key + " - " + map.get(key));
        }
        System.out.println("---------------");

        /**
         * values() que retorna uma Collection dos valores contidos no map
         */
        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("---------------");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
