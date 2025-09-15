package academy.devdojo.maratonajava.introduction.class05Arrays;

public class Arrays02Fori {
    public static void main(String[] args) {

        int counter = 1;
        String[] names = new String[4];
        names[0] = "Anung Un Rama";
        names[1] = "Abe Sapien";
        names[2] = "Liz Sherman";
        names[3] = "Trevor Bruttenholm";

        for (int i = 0; i < names.length; i++) {
            System.out.println(counter + " - " + names[i]);
            counter++;
        }
    }
}
