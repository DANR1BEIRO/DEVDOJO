package academy.devdojo.maratonajava.javacore.T_ResourceBundle.test;

import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println("Default locale: " + Locale.getDefault());

        ResourceBundle english = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        ResourceBundle br = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));

        System.out.println(english.getString("hello"));
        System.out.println(english.containsKey("goku"));
        System.out.println(english.getString("goku"));
        System.out.println(br.getString("hello"));
        System.out.println(br.getObject("goku"));

        String[] sayan = br.getString("sayajins").split(", ");
        System.out.println(Arrays.toString(sayan));

        Object sayanObj = br.getObject("sayajins");
        System.out.println(sayanObj);
    }
}
