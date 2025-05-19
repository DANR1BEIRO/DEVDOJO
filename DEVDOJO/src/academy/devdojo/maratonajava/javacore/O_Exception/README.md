## Exceptions pt1 - Errors (StackOverFlow)

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
