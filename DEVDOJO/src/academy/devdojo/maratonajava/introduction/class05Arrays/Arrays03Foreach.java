package academy.devdojo.maratonajava.introduction.class05Arrays;

public class Arrays03Foreach {
    public static void main(String[] args) {
        int[] number = new int[3];
        int[] number2 = {1,2,3,4,5};
        int[] number3 = new int[]{1,2,3,4,5};
        int number4 = 4;
        int number5 = 4;

        System.out.println("for i:");
        for (int i = 0; i < number3.length ; i++) {
            System.out.println(number3[i]);
        }

        System.out.println("\nFor each:");
        for(int num : number3) {
            System.out.println(num);
        }
    }
}
