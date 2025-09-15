package academy.devdojo.maratonajava.introduction.class03ConditionalStructures;

public class Class03TernaryOperator {
    public static void main(String[] args) {

        // buy ps5 if salary > 5000
        double salary = 3000;
        String canBuy = "I can buy a ps5!";
        String cantBuy = "I can't buy a ps5";

        // ternary operator sintax: (condition) ? true : false

        String result = salary > 5000 ? canBuy : cantBuy;
        System.out.println(result);




    }
}
