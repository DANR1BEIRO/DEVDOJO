# Formatação de Números e Locale em Java

## Introdução
Introdução à formatação de números utilizando a classe `NumberFormat` em conjunto com `Locale` para internacionalização (i18n) de aplicações Java.

## Classe NumberFormat

### Funcionalidades principais:
- Formata números de acordo com um Locale específico
- Pode formatar tanto números inteiros quanto decimais
- Oferece métodos estáticos para criação de instâncias

### Exemplo básico:
```java
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBrazil = new Locale("pt", "BR");
        Locale localeJapan = Locale.JAPAN;
        Locale localeItaly = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];
        
        nfa[0] = NumberFormat.getInstance(); // Usa o Locale padrão
        nfa[1] = NumberFormat.getInstance(localeJapan);
        nfa[2] = NumberFormat.getInstance(localeBrazil);
        nfa[3] = NumberFormat.getInstance(localeItaly);
        
        double value = 100_000_000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(value));
        }
    }
}
```

### Saída esperada (exemplo):
```
100,000,000.213
100,000,000.213
100.000.000,213
100.000.000,213
```

### Pontos importantes:
1. `NumberFormat.getInstance()` usa o Locale padrão do sistema
2. Cada Locale tem convenções específicas para:
    - Separador decimal (ponto ou vírgula)
    - Separador de milhares
    - Formato de agrupamento
3. O mesmo número é formatado de forma diferente em cada Locale

---

## Trabalhando com Locale

### Métodos úteis da classe Locale:
```java
import java.util.Locale;

public class LocalTest02 {
    public static void main(String[] args) {
        // Obtém o Locale padrão do sistema
        System.out.println(Locale.getDefault());
        
        // Lista todos os códigos de países ISO
        String[] isoCountries = Locale.getISOCountries();
        
        // Lista todos os códigos de idiomas ISO
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
```

### Principais características:
1. `Locale.getDefault()` - Retorna o Locale configurado na JVM
2. `getISOCountries()` - Retorna array com todos os códigos de países (ISO 3166)
3. `getISOLanguages()` - Retorna array com todos os códigos de idiomas (ISO 639)

### Locales pré-definidos:
Java possui vários Locales pré-definidos como:
- `Locale.US`
- `Locale.JAPAN`
- `Locale.ITALY`
- `Locale.GERMANY`
- `Locale.CHINA`

## Padrões de formatação por região:

| Locale   | Número 1.000,50 | Número 1000000 |
|----------|-----------------|----------------|
| Brasil   | 1.000,50        | 1.000.000      |
| EUA      | 1,000.50        | 1,000,000      |
| Japão    | 1,000.50        | 1,000,000      |
| Itália   | 1.000,50        | 1.000.000      |

## Melhores práticas:

1. **Sempre especifique o Locale** quando trabalhar com formatação
2. **Considere o Locale do usuário** em aplicações internacionais
3. **Teste com diferentes Locales** para garantir a consistência
4. **Use constantes de Locale** quando disponíveis (ex: `Locale.JAPAN`)

## Resumo:

1. `NumberFormat` é a classe principal para formatação de números
2. `Locale` determina as convenções culturais para formatação
3. A combinação dessas classes permite criar aplicações internacionalizadas
4. Java fornece métodos para listar todos os países e idiomas suportados
5. A formatação adequada melhora a experiência do usuário em diferentes regiões

