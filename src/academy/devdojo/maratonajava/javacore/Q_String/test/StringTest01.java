package academy.devdojo.maratonajava.javacore.Q_String.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "Goku"; // String constant pool
        String name2 = "Goku"; // String constant pool

        name = name.concat(" ssj");

        System.out.println(name);
        System.out.println(name == name2); // false

        String name3 = new String("Goku");
        System.out.println(name2 == name3); // false: referências diferentes
        System.out.println(name2.equals(name3)); // true: valores iguals

        //.equals(): valida se o valor das string é o mesmo
        // == : Valida se a referência dos objetos é igual
    }
}
