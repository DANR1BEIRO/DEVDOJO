## Classes Utilitárias - Wrappers em Java

### O que são Wrappers?

Wrappers são classes utilitárias que encapsulam (envolvem) os tipos primitivos do Java (`int`, `double`, `char`, etc.) em objetos.  
Cada tipo primitivo tem uma classe wrapper correspondente:

- `byte` → `Byte`
- `short` → `Short`
- `int` → `Integer`
- `long` → `Long`
- `float` → `Float`
- `double` → `Double`
- `char` → `Character`
- `boolean` → `Boolean`

Essas classes permitem que você trate valores primitivos como objetos, o que é útil em coleções (`List`, `Set`, etc.),
métodos genéricos e APIs que exigem objetos.

### Autoboxing e Unboxing

- **Autoboxing:** Conversão automática de um tipo primitivo para seu wrapper correspondente.
  ```java
  int x = 10;
  Integer y = x; // autoboxing: int → Integer
  ```

- **Unboxing**: Conversão automática de um wrapper para seu tipo primitivo correspondente.

````java
Integer a = 20;
int b = a; // unboxing: Integer → int
````

O Java faz essas conversões automaticamente quando necessário, tornando o código mais simples e legível.

### Métodos Estáticos Úteis nas Wrappers

As classes wrapper oferecem vários métodos estáticos utilitários, como:

- Conversão de String para número:

```java
int valor = Integer.parseInt("123"); // String → int
double d = Double.parseDouble("3.14"); // String → double
```

- Conversão de número para String:

````java
String texto = Integer.toString(123); // int → String
````

- Constantes úteis:

```java
int max = Integer.MAX_VALUE;
int min = Integer.MIN_VALUE;
```

- Comparação:

```java
int resultado = Integer.compare(10, 20); // retorna -1, 0 ou 1
```
 
#### Por que usar Wrappers?

- Permitem usar tipos primitivos em coleções genéricas (List<Integer>, por exemplo).
- Oferecem métodos utilitários para conversão, comparação e manipulação de valores.
- Facilitam a integração com APIs que exigem objetos.

#### Resumo

Wrappers encapsulam tipos primitivos em objetos.
Autoboxing e unboxing facilitam a conversão automática entre primitivos e wrappers.
As classes wrapper oferecem métodos estáticos úteis para conversão, comparação e manipulação de valores.