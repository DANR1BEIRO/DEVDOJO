package academy.devdojo.maratonajava.javacore.ZZH_designpatterns.factory.test;

import academy.devdojo.maratonajava.javacore.ZZH_designpatterns.factory.domain.Currency;
import academy.devdojo.maratonajava.javacore.ZZH_designpatterns.factory.domain.CurrencyFactory;
import academy.devdojo.maratonajava.javacore.ZZH_designpatterns.factory.enums.Country;

public class CurrencyFactoryTest01 {
    static void main() {
        Currency brazilianCurrency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(brazilianCurrency.getSimbol());

        Currency usaCurrency = CurrencyFactory.newCurrency(Country.USA);
        System.out.println(usaCurrency.getSimbol());
    }
}
