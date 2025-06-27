package academy.devdojo.maratonajava.javacore.S_Formatting.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * format: transforma do objeto para uma String
 * parse: transforma de uma Sting para um objeto
 */
public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Format:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        System.out.println("parse:");
        LocalDate parse1 = LocalDate.parse("20250627", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2025-06-27+01:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2025-06-27", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime parse4 = LocalDateTime.parse("2025-06-27T10:59:47.016091113");
        System.out.println(parse4);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDateTime.now().format(formatterBR);
        System.out.println("format: " + formatBR);
        LocalDate parseBR = LocalDate.parse("27/06/2025", formatterBR);
        System.out.println("Parse: " + parseBR);

        DateTimeFormatter formatterJP = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", Locale.JAPAN);
        String formatJP = LocalDate.now().format(formatterJP);
        System.out.println(formatJP);

    }
}
