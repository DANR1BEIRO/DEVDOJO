package academy.devdojo.maratonajava.javacore.S_Formatting.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBrazil = new Locale("pt", "BR");
        Locale localeJapan = Locale.JAPAN;
        Locale localeItaly = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJapan);
        nfa[2] = NumberFormat.getInstance(localeBrazil);
        nfa[3] = NumberFormat.getInstance(localeItaly);
        double value = 1000.50;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(value ));

        }
    }
}
