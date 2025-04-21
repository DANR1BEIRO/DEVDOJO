**O que é um enum?**

Imagine que precisamos criar um sistema para controlar robôs. Em vários
momentos, precisamos de variáveis que só podem ter alguns valores específicos.
Por exemplo:

- Um robô só pode estar **ligado, desligado** ou **em manutenção.**
- Um semáforo só pode estar **verde, amarelo** ou **vermelho.**

Poderíamos usar **strings** ou **números** para representar esses estados,
mas isso pode causar erros. Por exemplo, alguém pode digitar "ligadoo" com
dois "o" e o programa não vai entender.

O **enum** serve para resolver esse problema! Ele cria um **tipo especial
de variável** que só aceita valores pré-definidos. Assim, evitamos erros
e deixamos o código mais organizado.

**Exemplo básico:**<br>
![img_1.png](img_1.png)

- Aqui, _RobotState_ é um **enum** com três valores possíveis: **ON, OFF** e **MAINTANCE.**
- Não podemos inbentar outros valores para essa variável além de um desses três (a menos 
que esse novo valor seja criado direto no enum).

**Usando enum em uma classe:**

![img_2.png](img_2.png)

Agora, quando criarmos um robô, só podemos passar um dos valores do enum:

![img_3.png](img_3.png)

Se tentarmos passar qualquer valor diferente, o Java não deixa!

**Por que usar enum?**

- **Evita erros de digitação:** Não corremos o risco de escrever o estado errado
- **Mais seguro:** O Java só aceita os valores definidos no enum.
- **Mais organizado:** Fica fácil de entender quais são as opções possíveis para aquela variável

**O enum é ainda mais poderoso do que parece!**

Podemos adicionar **informações extras e métodos** ao enum. Por exemplo, podemos atribuir
uma descrição para cada estado:

![img_4.png](img_4.png)

Agora, podemos fazer:

![img_5.png](img_5.png)


**Usando enums em decisões switch:**<br>
Podemos usar enums em estruturas de decisão como _switch case_:

![img_6.png](img_6.png)

Chamando o método com o switch:<br>
![img_7.png](img_7.png)

Output:<br>
![img_8.png](img_8.png)

**Resumindo:**
- **Enum** é um tipo especial de variável que só aceita valores pré-definidos.
- Ajuda a evitar erros e deixa o código mais seguro e organizado.
- Muito útil para representar estados, tipos, comandos, dias da semana, etc.
- Pode ter métodos e informações extras.



