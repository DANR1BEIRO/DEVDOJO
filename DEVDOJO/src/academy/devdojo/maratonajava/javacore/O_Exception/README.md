## Exceptions pt1 - Errors (StackOverFlow)

![img_2.png](img_2.png)

Esse diagrama mostra a hierarquia de tratamento de erros e exceções em Java. Ele representa como as principais classes
relacionadas a erros e exceções estão organizadas na linguagem.

Throwable: É a superclasse de todos os erros e exceções em Java. Tudo que pode ser "lançado" (throw) ou "capturado" 
(catch) herda de Throwable.

Error: Subclasse de Throwable. Representa erros graves que normalmente não devem ser tratados pelo programa, como 
problemas do sistema ou da máquina virtual (por exemplo, OutOfMemoryError). São situações que geralmente não podem 
ser recuperadas.

Exception: Também subclasse de Throwable. Representa condições que um programa pode querer capturar e tratar.
Dentro de Exception, há duas divisões principais:

RuntimeException: Exceções que ocorrem durante a execução do programa e que normalmente indicam erros de 
programação, como NullPointerException, NumberFormatException, ClassCastException, IndexOutOfBoundsException, 
entre outras. Essas exceções não precisam ser declaradas ou capturadas obrigatoriamente (unchecked exceptions).
Outras exceções: Como IOException, SQLException, MalformedURLException, etc. Essas são chamadas de checked exceptions
e precisam ser tratadas ou declaradas no código.

Resumo visual:

Azul: Classes base e exceções "checked" (precisam ser tratadas).
Vermelho: Erros e exceções "unchecked" (não precisam ser tratadas obrigatoriamente).

#### O que é StackOverflowError em Java?

O StackOverflowError é um erro que ocorre quando a pilha de execução (stack) 
de um programa excede o limite de memória reservado para ela. Em Java, isso 
normalmente acontece devido a chamadas recursivas de métodos sem uma condição 
de parada adequada.
Como funciona a pilha (stack)?

Quando um método é chamado em Java, informações sobre essa chamada 
(como variáveis locais e o endereço de retorno) são armazenadas na pilha. 
Cada nova chamada de método adiciona um novo "quadro" (frame) à pilha. 
Se métodos forem chamados indefinidamente, a pilha cresce até atingir o 
limite de memória, causando o StackOverflowError.

### Exemplo clássico de StackOverflowError

Veja um exemplo simples:

![img.png](img.png)

Neste exemplo, o método _recursiveMethod()_ chama a si mesmo infinitamente, sem nunca parar. 
Cada chamada ocupa espaço na pilha, até que a memória reservada para a stack acabe, gerando o erro:

```
Exception in thread "main" java.lang.StackOverflowError
```
### Como evitar o StackOverflowError?

Para evitar esse erro, toda recursão deve ter uma condição de parada clara. Por exemplo:
![img_1.png](img_1.png)

Aqui, o método só chama a si mesmo enquanto o contador for maior que zero, 
evitando o estouro da pilha.

#### Resumindo:

O StackOverflowError é um erro comum em programas que usam recursão sem controle. 
Ele indica que a pilha de chamadas do programa ficou cheia, geralmente por falta 
de uma condição de parada em métodos recursivos.
