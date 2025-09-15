package academy.devdojo.maratonajava.javacore.S_Formatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBrazil = new Locale("pt", "BR");
        Locale localeJapan = Locale.JAPAN;
        Locale localeItaly = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeJapan);
        nfa[2] = NumberFormat.getCurrencyInstance(localeBrazil);
        nfa[3] = NumberFormat.getCurrencyInstance(localeItaly);
        double value = 1000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(value ));
        }
        String valueString = "1.000,21 €";
        try {
            System.out.println(nfa[3].parse(valueString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
