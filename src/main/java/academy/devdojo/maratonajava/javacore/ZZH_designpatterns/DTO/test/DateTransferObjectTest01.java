package academy.devdojo.maratonajava.javacore.ZZH_designpatterns.DTO.test;

import academy.devdojo.maratonajava.javacore.ZZH_designpatterns.DTO.domain.ReportDto;
import academy.devdojo.maratonajava.javacore.ZZH_designpatterns.builder.domain.Person;
import academy.devdojo.maratonajava.javacore.ZZH_designpatterns.factory.domain.Currency;
import academy.devdojo.maratonajava.javacore.ZZH_designpatterns.factory.domain.CurrencyFactory;
import academy.devdojo.maratonajava.javacore.ZZH_designpatterns.factory.enums.Country;
import academy.devdojo.maratonajava.javacore.ZZH_designpatterns.singleton.domain.Aircraft;

public class DateTransferObjectTest01 {
    static void main() {

        // Recebe os dados de lugares diferentes

        Aircraft aircraft = new Aircraft("777");
        Country brazil = Country.BRAZIL;
        Currency real = CurrencyFactory.newCurrency(brazil);
        Person goku = Person.Builder.builder()
                .firstName("Goku")
                .build();

        // Envia os dados agregados para o front

        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(brazil)
                .currency(real)
                .personName(goku.getFirstName())
                .build();

        System.out.println(reportDto);
    }
}
