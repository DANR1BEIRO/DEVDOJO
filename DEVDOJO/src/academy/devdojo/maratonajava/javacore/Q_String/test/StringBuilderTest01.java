package academy.devdojo.maratonajava.javacore.Q_String.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        /**
         * Strings are immutable, so the .concat method doesn't
         * change the string stored in the variable name, but creates another string
         * in the string pool.
         */
        String name = "Hange";
        String fullName = name.concat(" Zoe");
        System.out.println(fullName);


        /**
         * For a stringBuilder object, we can provide different parameters:
         * @param1: An integer to define the initial capacity of the StringBuilder
         * in memory. By default, the size is set to 16 characters.
         * If the string becomes larger, the capacity will double automatically.
         * @param2: A string to initialize the builder with a value
         * @param3: A charSequence
         *
         * Although a StringBuilder isn't a String,
         * we can print the value of a StringBuilder object because this
         * class overrides the toString method. So if we pass a
         * StringBuild object to println, toString() is called by default.
         */
        StringBuilder sb = new StringBuilder("Levi Ackerman");
        System.out.println(sb);

        /**
         * We can also use an append method to concatenate to a StringBuilder
         * object without needing to create a new String in memory (reassign
         * the reference).
         */
        sb.append(" - Captain of the Survey Corp's Special Operations Squad.");
        System.out.println(sb);

    }
}
