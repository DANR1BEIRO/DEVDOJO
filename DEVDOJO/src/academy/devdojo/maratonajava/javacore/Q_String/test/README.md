 
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

---

## Performance de Strings em Java: String, StringBuilder e StringBuffer

### Por que comparar?

Em Java, manipular textos é muito comum, mas a forma como fazemos isso pode impactar bastante a performance de um 
programa, principalmente em operações repetitivas de concatenação.  
Veremos a diferença de performance entre três formas de concatenar strings:
**String**, **StringBuilder** e **StringBuffer**.

### Strings são imutáveis

- **String** em Java é imutável: toda vez que você concatena, um novo objeto é criado na memória.
- Isso faz com que operações repetidas de concatenação com `+` ou `.concat()` sejam **muito lentas** em grandes volumes de dados.

#### Exemplo:
```java
String text = "";
for (int i = 0; i < 100_000; i++) {
    text += i;
}
```
Cada iteração cria um novo objeto String, tornando o processo lento e ineficiente.
StringBuilder

### StringBuilder
- StringBuilder é uma classe mutável, criada para manipulação eficiente de textos.
- Permite adicionar, remover e modificar o conteúdo sem criar novos objetos a cada operação.
- É muito mais rápido para concatenação em laços.

#### Exemplo:

````java
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 10_000_000; i++) {
sb.append(i);
}
````

### StringBuffer

- StringBuffer é semelhante ao StringBuilder, mas é thread-safe (sincronizado).
- Isso significa que pode ser usado com segurança em ambientes multi-thread, mas é um pouco mais lento que o StringBuilder devido à sincronização.

**Thread-safe** (ou "seguro para threads") é um termo usado em programação para descrever um código, método, classe ou 
estrutura de dados que pode ser usado **simultaneamente por múltiplas threads** sem causar erros, corrupção de dados ou
comportamentos inesperados.

#### Por que isso é importante?

Em programas que usam **multithreading** (várias threads rodando ao mesmo tempo), diferentes threads 
podem tentar acessar e modificar os mesmos dados ao mesmo tempo.
Se o código **não for thread-safe**, isso pode causar problemas como:

- Dados inconsistentes
- Resultados errados
- Erros difíceis de identificar (bugs intermitentes)

#### Como o Java garante thread-safety?

- Usando **sincronização** (synchronized), que faz com que apenas uma thread por vez possa acessar um trecho de código crítico.
- Usando classes e métodos projetados para serem thread-safe, como StringBuffer, Vector, ConcurrentHashMap, etc.

#### Exemplo prático:

- **StringBuilder NÃO** é thread-safe: se duas threads usarem o mesmo objeto ao mesmo tempo, pode dar problema.
- **StringBuffer É** thread-safe: ele usa sincronização interna, então pode ser usado por várias threads ao mesmo tempo sem corromper os dados.

#### Resumo:

- **Thread-safe**: Pode ser usado por várias threads ao mesmo tempo, sem problemas.
- **Não thread-safe**: Pode causar erros se usado por várias threads simultaneamente.

#### Exemplo:

````java
StringBuffer sb = new StringBuffer();
for (int i = 0; i < 10_000_000; i++) {
sb.append(i);
}
````

### Resultados do teste de performance

No código, medimos o tempo de execução de cada abordagem:

- **String**: Muito lento para grandes volumes de concatenação.
- **StringBuilder**: Extremamente rápido e recomendado para manipulação de textos em laços.
- **StringBuffer**: Rápido, mas um pouco mais lento que StringBuilder devido à sincronização.

Exemplo de saída:

_Time normal string: 1200ms<br>
Time string builder: 30ms<br>
Time string buffer: 40ms_

(Os valores são apenas ilustrativos, variam conforme o computador).

#### ando usar cada um?

- **String**: Para textos pequenos ou quando não há muitas concatenações.
- **StringBuilder**: Para manipulação intensiva de textos em aplicações single-thread.
- **StringBuffer**: Para manipulação intensiva de textos em aplicações multi-thread.