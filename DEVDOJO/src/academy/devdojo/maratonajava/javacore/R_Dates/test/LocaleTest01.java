package academy.devdojo.maratonajava.javacore.R_Dates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        Locale localeBrazil = new Locale("pt", "BR");
        Locale localeHindi = new Locale("hi", "IN");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeChina = new Locale("zh", "CN");
        Locale localeKorean = new Locale("ko", "KP");
        Locale localeArgentina = new Locale("es", "AR");

        DateFormat brazil = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
        DateFormat hindi = DateFormat.getDateInstance(DateFormat.FULL, localeHindi);
        DateFormat japan = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat china = DateFormat.getDateInstance(DateFormat.FULL, localeChina);
        DateFormat korean = DateFormat.getDateInstance(DateFormat.FULL, localeKorean);
        DateFormat argentina = DateFormat.getDateInstance(DateFormat.FULL, localeArgentina);

        System.out.println("Brazil: " + brazil.format(calendar.getTime()));
        System.out.println("Hindi: " + hindi.format(calendar.getTime()));
        System.out.println("Japan: " + japan.format(calendar.getTime()));
        System.out.println("China: " + china.format(calendar.getTime()));
        System.out.println("Korean: " + korean.format(calendar.getTime()));
        System.out.println("Argentina: " + argentina.format(calendar.getTime()));

        System.out.println(localeJapan.getDisplayCountry(localeBrazil));
        System.out.println(localeJapan.getDisplayCountry(localeArgentina));
        System.out.println(localeJapan.getDisplayCountry(localeKorean));
    }
}
