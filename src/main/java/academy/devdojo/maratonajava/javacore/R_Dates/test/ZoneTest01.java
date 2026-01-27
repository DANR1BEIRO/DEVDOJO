package academy.devdojo.maratonajava.javacore.R_Dates.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {

        Map<String, String> shortIds = ZoneId.SHORT_IDS; //ZoneId.SHORT_IDS retorna
        // um mapa de apelidos para zonas completas, tipo "JST" -> "Asia/Tokyo".
        System.out.println(shortIds);
        System.out.println("System zone: " + ZoneId.systemDefault()); // zona do sistema

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println("\nTokyo zone id: " + tokyoZone);

        // Pega a data e hora local, sem se importar com o fuso horário.
        LocalDateTime now = LocalDateTime.now();
        System.out.println("\nLocal date time(sem fuso): " + now);

        /**
         * Associa a data/hora local a um fuso horário específico (Tóquio).
         * A hora vai ser interpretada como se estivesse em Tóquio,
         * mesmo que tenha sido gerada localmente.
         */
        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println("\nAssocia a data/hora local a um fuso específico: " + zonedDateTime);

        // Instant é um timestamp global, ou seja, sempre UTC (fuso zero).
        Instant nowIntant = Instant.now();
        System.out.println("\nZulu time: " + nowIntant);

        /**
         *  Convertendo um Instant para ZonedDateTime:
         *  É como dizer: "Esse instante universal, que horas são em Tóquio?".
         * Ele converte o Instant para hora local de Tóquio.
         */
        ZonedDateTime zonedDateTime1 = nowIntant.atZone(tokyoZone);
        System.out.println("\nConverte Instant para hora local de Tóquio: " + zonedDateTime1);

        // Mostra os limites possíveis de deslocamento UTC, conforme padrão ISO-8601.
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        /**
         * OffsetDateTime: Associando fuso fixo à data/hora
         * OffsetDateTime é como dizer: "Essa data tem um deslocamento fixo do UTC".
         * Exemplo: 2025-06-26T09:45-04:00
         * É usado quando queremos hora exata com deslocamento, mas sem usar
         * zona (como America/Manaus), só o deslocamento numérico.
         */
        ZoneOffset offSetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offSetManaus);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(now, offSetManaus);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = nowIntant.atOffset(offSetManaus);
        System.out.println(offsetDateTime2);

        /**
         * Calendário Japonês(JapaneseDate)
         * Converte a data atual para o calendário usado oficialmente no Japão.
         * Os anos são contados por eras imperiais(ex: Reiwa, Heisei).
         */
        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);

        /**
         * Data na era Meiji
         * Pegfa uma data antiga(1 de fev de 1990) e mostra em que era
         * japonesa ela pertence.
         */
        LocalDate meiji = LocalDate.of(1900, 2, 1);
        JapaneseDate meijiEra = JapaneseDate.from(meiji);
        System.out.println(meijiEra);

    }
}
