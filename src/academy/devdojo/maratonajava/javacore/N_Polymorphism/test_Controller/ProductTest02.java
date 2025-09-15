package academy.devdojo.maratonajava.javacore.N_Polymorphism.test_Controller;

import academy.devdojo.maratonajava.javacore.N_Polymorphism.domain_Model.Computer;
import academy.devdojo.maratonajava.javacore.N_Polymorphism.domain_Model.Product;
import academy.devdojo.maratonajava.javacore.N_Polymorphism.domain_Model.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {

        Product product = new Computer("Ryzen 5", 1000);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.calculateTaxValue());

        Product product2 = new Tomato("Sicilian", 10);
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println(product2.calculateTaxValue());

        Tomato tomato = new Tomato("Italian", 10);
        tomato.setBestBefore("27/04/2025");
        System.out.println(tomato.getName());
        System.out.println(tomato.getPrice());
        System.out.println(tomato.calculateTaxValue());
        System.out.println(tomato.getBestBefore());

        product2 = new Computer("novo computador",5);
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println(product2.calculateTaxValue());
        /**
         * O objeto Tomato que estava sendo referenciado por product2 ainda existe
         * na memória imediatamente após a atribuição, mas agora está sem referência
         * (a menos que alguma outra variável ainda aponte para ele).
         *
         * Como não há mais nenhuma variável apontando para aquele objeto, ele se torna
         * inacessível pelo código. Em Java, objetos sem referência ficam "órfãos" e, em algum
         * momento, o garbage collector (coletor de lixo) do Java irá liberar a memória ocupada
         * por esse objeto automaticamente.
         */
    }
}
