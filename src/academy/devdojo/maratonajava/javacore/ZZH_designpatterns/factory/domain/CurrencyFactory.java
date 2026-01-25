package academy.devdojo.maratonajava.javacore.ZZH_designpatterns.factory.domain;

import academy.devdojo.maratonajava.javacore.ZZH_designpatterns.factory.enums.Country;

public class CurrencyFactory {
    public static Currency newCurrency(Country country) {
        switch (country) {
            case USA:
                return new UsDollar();
            case BRAZIL:
                return new Real();
            default:
                throw new IllegalArgumentException("No currency found for this country");
        }
    }
}
