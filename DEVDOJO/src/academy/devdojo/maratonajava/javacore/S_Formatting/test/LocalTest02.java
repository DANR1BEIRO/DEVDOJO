package academy.devdojo.maratonajava.javacore.S_Formatting.test;

import java.util.Locale;

public class LocalTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        System.out.print("Languages: ");
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }

        System.out.println(" ");

        System.out.print("Countries: ");
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " ");
        }
    }
}
