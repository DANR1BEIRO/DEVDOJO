package academy.devdojo.maratonajava.javacore.Q_String.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "     Hange Zoe     ";
        String name2 = "hange Zoe";
        String numbers = "012345";
        System.out.println(name.charAt(0));
        System.out.println(numbers.length());
        System.out.println(name.length());
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name.replace("e", "y"));
        System.out.println(name.replaceAll("Hange", "Goku"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());




    }
}
