package academy.devdojo.maratonajava.introduction.class05Arrays;

public class ArrayTest01 {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int[] c = new int[ARRAY_LENGTH];

        System.out.printf("%s%8s%n", "Index", "Value");
        for (int i = 0; i < c.length; i++) {
            c[i] = 2 + 2 * i;
            System.out.printf("%d%9d%n", i, c[i]);
        }
    }
}
