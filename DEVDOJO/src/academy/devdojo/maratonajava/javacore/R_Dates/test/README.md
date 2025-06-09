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