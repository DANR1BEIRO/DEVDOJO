package academy.devdojo.maratonajava.introduction.class05Arrays;

public class Arrays04MultidimensionalArrays03 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] baseArray : arrayInt2) {
            for (int num : baseArray) {
                System.out.print(num);
            }
            System.out.println("\n-----------");
        }
    }
}
