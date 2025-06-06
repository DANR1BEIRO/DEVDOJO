
## Strings em Java: String Pool, Concatenação e Comparação

### O que é o String Constant Pool?

Em Java, as Strings são objetos imutáveis e possuem um mecanismo especial de armazenamento chamado **String Constant Pool**.  
Quando você cria uma String usando aspas (`"Goku"`), o Java armazena esse valor no pool de Strings. 
Se outra variável receber o mesmo valor literal, ela irá referenciar o mesmo objeto no pool, economizando memória.

```java
String name = "Goku"; // Armazenado no String pool
String name2 = "Goku"; // Reutiliza o mesmo objeto do pool
```

### Concatenação de Strings:

Strings em Java são imutáveis. Isso significa que, ao concatenar uma String, um novo objeto é criado:

````java
name = name.concat(" ssj"); // Cria uma nova String "Goku ssj"
````

Após a concatenação, name aponta para um novo objeto, enquanto name2 continua apontando para o original.

### Comparação de Strings: == vs .equals():

- == compara se as referências dos objetos são iguais (ou seja, se apontam para o mesmo objeto na memória).
- .equals() compara se o conteúdo (valor) das Strings é igual.

#### Exemplo prático:

````java
String name = "Goku";
String name2 = "Goku";
System.out.println(name == name2); // true (mesma referência do pool)

String name3 = new String("Goku");
System.out.println(name2 == name3); // false (objetos diferentes)
System.out.println(name2.equals(name3)); // true (valores iguais)
````
- `name` e `name2` apontam para o mesmo objeto no pool, então == retorna true.
- `name3` é criado com new String(), então é um novo objeto, mesmo que o valor seja igual. Por isso, == retorna false, mas .equals() retorna true.


#### Resumo:

- `String pool`: Literais de String são armazenados e reutilizados para economizar memória.
- `Imutabilidade`: Qualquer modificação em uma String cria um novo objeto.
- `Comparação`: Use .equals() para comparar valores de Strings. Use == apenas se quiser saber se são o mesmo objeto.