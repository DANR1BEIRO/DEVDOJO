package academy.devdojo.maratonajava.introduction.class05Arrays;

// Store three ages

public class Arrays01 {
    public static void main(String[] args) {

        int[] age = new int[3];
        age[0] = 21;
        age[1] = 15;
        age[2] = 11;
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        // System.out.println(age[3]); -> out of bounds exceptions

    }
}
