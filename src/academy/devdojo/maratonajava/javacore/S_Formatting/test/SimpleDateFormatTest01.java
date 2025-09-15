package academy.devdojo.maratonajava.javacore.S_Formatting.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Itaguaí' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));

        try {
            System.out.println(simpleDateFormat.parse("Itaguaí 21 de June de 2025"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}


// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html