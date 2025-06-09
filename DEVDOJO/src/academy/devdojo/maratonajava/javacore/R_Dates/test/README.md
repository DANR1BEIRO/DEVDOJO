# Java Dates: Classe `java.util.Date`

## Introdução

A classe `java.util.Date` é uma das formas mais antigas de trabalhar com datas e horários em Java.  
Apesar de ser considerada "legacy" (antiga) e ter limitações, ainda é importante entender seu funcionamento, 
pois muitos sistemas legados utilizam essa classe.

## Como funciona a classe Date?

- A classe `Date` armazena **um valor do tipo `long`** que representa a quantidade de **milissegundos desde 1º de janeiro de 1970, 00:00:00 GMT** (também chamado de "Epoch").
- Quando você cria um objeto `Date` passando um valor long, está dizendo quantos milissegundos se passaram desde essa data base.

## Exemplo prático:

```java
import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        // Date works with milliseconds. It stores a long value with the ms since 1970
        Date date = new Date(1749478092612L);
        System.out.println(date);
    }
}
```
### Pontos importantes:

- **Construtor padrão**: new Date() cria um objeto com a data e hora atual.
- **Construtor com long**: new Date(long ms) cria um objeto para um instante específico.
- **Impressão**: Ao imprimir um objeto Date, o método toString() retorna uma representação legível da data e hora.
- **Limitações**: A classe Date tem vários métodos obsoletos e limitações, por isso, para novos projetos, recomenda-se usar as classes do pacote java.time (Java 8+), como LocalDate, LocalDateTime, etc.

### Resumo:

- java.util.Date representa um instante no tempo, baseado em milissegundos desde 1970.
- Útil para manipular datas em sistemas legados.
- Para novos projetos, prefira as classes do pacote java.time.

---

# Java Dates: Classe `java.util.Calendar`

## Introdução

A classe `java.util.Calendar` é uma alternativa mais flexível e poderosa que a antiga `java.util.Date` para manipulação de datas e horários em Java.  
Apesar de também ser considerada "legacy" (antiga) e ter sido substituída pelo pacote `java.time` no Java 8+, o `Calendar` ainda é muito usado em sistemas legados.

## Como funciona a classe Calendar?

- **Calendar é uma classe abstrata**, ou seja, não pode ser instanciada diretamente.
- Para obter uma instância, utiliza-se o método estático `Calendar.getInstance()`, que retorna um objeto de uma subclasse concreta (geralmente `GregorianCalendar`).
- O `Calendar` permite acessar e modificar facilmente partes específicas da data (dia, mês, ano, hora, etc.).

## Exemplo prático:

```java
import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        // Since Calendar is abstract, you can't instantiate it directly.
        Calendar c = Calendar.getInstance();

        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Sunday is the first day of the week");
        }

        System.out.println(c.get(Calendar.DAY_OF_MONTH)); // Current day of the month
        System.out.println(c.get(Calendar.DAY_OF_YEAR));  // Current day of the year
        System.out.println(c.get(Calendar.DAY_OF_WEEK));  // Current day of the week

        c.roll(Calendar.DAY_OF_MONTH, 20); // Rolls the day of the month by 20 (doesn't affect higher fields)
        c.add(Calendar.HOUR, 50);          // Adds 50 hours to the current time

        Date date = c.getTime();           // Converts Calendar to Date
        System.out.println(date);
    }
}
```
### Pontos importantes:

- **Instanciação**: Use Calendar.getInstance() para obter um objeto Calendar.
- **Acesso a campos**: Use o método get(int field) para acessar partes da data, como dia do mês, dia do ano, dia da semana, etc.
- **Modificação de datas**:
    - add(field, amount): Adiciona (ou subtrai) uma quantidade a um campo, ajustando os campos superiores se necessário.
    - roll(field, amount): Rola o valor de um campo sem afetar os campos superiores.
- **Conversão para Date**: O método getTime() retorna um objeto Date correspondente ao valor atual do Calendar.

### Resumo:

- java.util.Calendar é uma classe abstrata para manipulação avançada de datas e horários.
- Permite acessar e modificar partes específicas da data/hora.
- Para novos projetos, prefira as classes do pacote java.time (Java 8+), como LocalDate, LocalDateTime, etc.

---

# Java Dates: Classe `java.text.DateFormat`

## Introdução

A classe `java.text.DateFormat` é uma ferramenta poderosa para formatar e exibir datas e horários em diferentes estilos e padrões em Java.  
O `DateFormat` facilita a conversão de objetos `Date` (ou `Calendar`) para strings legíveis, de acordo com o formato desejado.

## Como funciona a classe DateFormat?

- `DateFormat` é uma classe abstrata usada para formatar e analisar datas.
- Ela possui métodos estáticos para obter instâncias pré-configuradas com diferentes estilos de formatação.
- Os estilos principais são: `SHORT`, `MEDIUM`, `LONG` e `FULL`, além dos padrões padrão do sistema.

## Exemplo prático:

```java
import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] dfa = new DateFormat[7];

        dfa[0] = DateFormat.getInstance();
        dfa[1] = DateFormat.getDateInstance();
        dfa[2] = DateFormat.getDateTimeInstance();
        dfa[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        dfa[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfa[5] = DateFormat.getDateInstance(DateFormat.LONG);
        dfa[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat dateFormat : dfa) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
```

Neste exemplo, o código cria um array de diferentes formatos de data e imprime a data atual em cada um deles, mostrando como o mesmo valor pode ser exibido de várias formas.

### Pontos importantes:

- **Instâncias de DateFormat:**
    - getInstance(): Retorna o formato padrão do sistema.
    - getDateInstance(): Retorna o formato padrão de data.
    - getDateTimeInstance(): Retorna o formato padrão de data e hora.
    - getDateInstance(style): Retorna o formato de data no estilo especificado (SHORT, MEDIUM, LONG, FULL).
- **Formatação**:
O método format(Date) converte um objeto Date (ou Calendar.getTime()) em uma string formatada.
- **Internacionalização**:
O DateFormat adapta o formato de acordo com o local (locale) do sistema, facilitando a exibição de datas em diferentes países.

### **Resumo**:

- java.text.DateFormat é usado para formatar e exibir datas em diferentes estilos.
- Permite converter datas para strings legíveis de acordo com o padrão desejado.
- Para novos projetos, considere usar as classes do pacote java.time.format (Java 8+), como DateTimeFormatter.

---

# Java Dates: Locale e Internacionalização

## Introdução

Esta aula apresenta o conceito de **Locale** em Java, fundamental para internacionalização (i18n) de aplicações.  
O `Locale` representa uma região geográfica, idioma e, opcionalmente, variantes culturais.  
Com ele, é possível exibir datas, números, moedas e textos de acordo com as convenções de diferentes países e idiomas.

## Como funciona o Locale?

O `Locale` é uma classe que encapsula informações sobre idioma e país.  
É usado por várias APIs do Java para adaptar a apresentação de dados (datas, números, etc.) ao padrão local.  
Um `Locale` é criado informando o código do idioma (ex: `"pt"` para português) e o código do país (ex: `"BR"` para Brasil).

## Exemplo prático

```java
import java.text.DateFormat;
import java.util.Calendar;
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
```
## Pontos importantes:

### Criação de Locale:
- Use `new Locale("idioma", "PAÍS")` para criar um objeto representando uma localidade específica
- Exemplo: `"pt", "BR"` para português do Brasil

### Formatação de datas com Locale:
- `DateFormat.getDateInstance(DateFormat.FULL, locale)` retorna um formatador de datas
- O formatador segue o padrão do país/idioma informado

### Exibição de datas em diferentes idiomas:
- A mesma data formatada com diferentes Locales terá saídas diferentes
- Cada saída segue as convenções do país/idioma especificado

### Exibição do nome do país em diferentes idiomas:
- `getDisplayCountry(locale)` retorna o nome do país no idioma especificado
- Exemplo:  
  `localeJapan.getDisplayCountry(localeBrazil)` → "Japão"  
  `localeJapan.getDisplayCountry(localeArgentina)` → "Japón"  
  `localeJapan.getDisplayCountry(localeKorean)` → "일본"

## Saída esperada (exemplo): 

```
Brazil: terça-feira, 8 de julho de 2025
Hindi: मंगलवार, 8 जुलाई, 2025
Japan: 2025年7月8日火曜日
China: 2025年7月8日星期二
Korean: 2025년 7월 8일 화요일
Argentina: martes 8 de julio de 2025
Japão
Japón
일본
```

*Observação: A saída pode variar conforme a data de execução e as configurações do sistema.*

## Resumo:

- **Propósito do Locale**:  
  Adaptar a apresentação de dados para diferentes países e idiomas

- **Importância**:  
  Essencial para internacionalização (i18n) de aplicações Java

- **Classes relacionadas**:  
  Pode ser usado com:
    - `DateFormat` para formatação de datas
    - `NumberFormat` para números e moedas
    - Outras classes de internacionalização

- **Benefício principal**:  
  Garante que dados sejam exibidos conforme o padrão cultural do usuário



>Observação final: O exemplo demonstra como pequenas variações no Locale podem produzir grandes diferenças na 
> apresentação dos dados, tornando o aplicativo mais acessível e adequado a diferentes culturas.