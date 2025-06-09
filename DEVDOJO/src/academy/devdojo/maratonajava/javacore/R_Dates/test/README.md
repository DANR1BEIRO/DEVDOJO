# Java Dates: Classe `java.util.Date`

## Introdução

A classe `java.util.Date` é uma das formas mais antigas de trabalhar com datas e horários em Java.  
Apesar de ser considerada "legacy" (antiga) e ter limitações, ainda é importante entender seu funcionamento, 
pois muitos sistemas legados utilizam essa classe.

## Como funciona a classe Date?

- A classe `Date` armazena **um valor do tipo `long`** que representa a quantidade de **milissegundos desde 1º de janeiro de 1970, 00:00:00 GMT** (também chamado de "Epoch").
- Quando você cria um objeto `Date` passando um valor long, está dizendo quantos milissegundos se passaram desde essa data base.

## Exemplo prático

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
