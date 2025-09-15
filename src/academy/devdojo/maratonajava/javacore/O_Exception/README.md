## Exceptions pt1 - Errors 

### O que são Exceções?
Exceções são condições anormais que ocorrem durante a execução de um programa, interrompendo o fluxo normal de instruções.

#### Hierarquia de Exceções em Java:
Tudo que pode ser "lançado" (thrown) em Java herda da classe Throwable.
Throwable tem duas subclasses principais:

- **Error**: Representa problemas sérios que uma aplicação razoável não deveria tentar tratar. Geralmente são condições anormais que ocorrem na Java Virtual Machine (JVM) ou no ambiente de execução.

- **Exception:** Representa condições que uma aplicação pode querer tratar. Estas são subdivididas em exceções checadas (checked exceptions) e não checadas (unchecked exceptions/runtime exceptions)

#### Error (Erro):
São situações das quais, na maioria das vezes, o programa não consegue se recuperar.
Quando um Error ocorre, a JVM geralmente para a execução do programa.

#### Exemplos de Error:
- _OutOfMemoryError_: Ocorre quando a JVM não consegue alocar mais memória porque toda a memória disponível foi esgotada.

- _StackOverflowError_: Ocorre quando a pilha de chamadas de métodos (call stack) excede seu limite de tamanho. Isso é comum em recursões infinitas ou muito profundas.

A solução para um _Error_ geralmente envolve corrigir o problema fundamental no código ou no ambiente (ex: aumentar a memória da JVM, corrigir uma recursão infinita) e reiniciar a aplicação. Não se espera que o programa trate esses erros em tempo de execução.

Demonstração Prática: StackOverflowError:
Um _StackOverflowError_ pode ocorrer criando um método recursivo simples que chama a si mesmo indefinidamente, sem uma condição de parada. Cada chamada de método é empilhada na "stack". Em uma recursão infinita, a pilha cresce até estourar a memória alocada para ela, resultando no _StackOverflowError_.
Uma vez que esse erro ocorre, não há muito o que o programa possa fazer para se recuperar; a JVM interrompe a execução.

#### Conclusão sobre Error:
Error é que são problemas graves, geralmente ligados à JVM ou ao ambiente, e que a aplicação não deve tentar capturá-los ou se recuperar deles. A ação correta é identificar a causa raiz, corrigir o código ou o ambiente e reiniciar.

---
![img_2.png](img_2.png)![img_2.png](img_2.png)

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

---
## O que é StackOverflowError em Java?

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

---

## Tratamento de Exceções: Ordem dos Blocos `catch` em Java

### Por que a ordem dos blocos `catch` importa?

Em Java, quando usamos múltiplos blocos `catch` para tratar exceções, **a ordem em que eles aparecem é fundamental**. Sempre devemos colocar os blocos que tratam exceções **mais específicas antes dos mais genéricos**.

Se você colocar um bloco `catch` genérico antes de um específico, o compilador vai acusar erro, pois o bloco específico nunca será alcançado.

### Exemplo Correto:

```java
try {
    throw new RuntimeException();
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Inside ArrayIndexOutOfBoundsException");
} catch (IndexOutOfBoundsException e) {
    System.out.println("Inside IndexOutOfBoundsException");
} catch (IllegalArgumentException e) {
    System.out.println("Inside IllegalArgumentException");
} catch (ArithmeticException e) {
    System.out.println("Inside ArithmeticException");
} catch (RuntimeException e) { // O mais genérico deve ser o último
    System.out.println("Inside RuntimeException");
}
```
Neste exemplo, cada exceção mais específica é tratada antes da exceção mais genérica (RuntimeException). Assim, o código compila e funciona corretamente.

### Exemplo Incorreto:

```java
try {
    throw new ArrayIndexOutOfBoundsException();
} catch (RuntimeException e) {
    System.out.println("Inside RuntimeException");
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Inside ArrayIndexOutOfBoundsException");
}
```

Erro de compilação:

error: exception `ArrayIndexOutOfBoundsException has already been caught`

Neste caso, o bloco catch (RuntimeException e) captura todas as exceções do tipo RuntimeException e suas filhas, incluindo ArrayIndexOutOfBoundsException. Por isso, o segundo bloco nunca será executado, gerando erro de compilação.

### Resumo:

Sempre coloque os blocos catch das exceções mais específicas antes dos mais genéricos.
Se inverter a ordem, o código não compila.
Use múltiplos blocos catch quando quiser tratar exceções de formas diferentes.
Se o tratamento for igual, pode usar apenas o bloco mais genérico.

---

## Exceções Multi-Catch em Linha 

### O que é Multi-Catch?

A partir do Java 7, foi introduzida uma nova sintaxe para tratar múltiplas exceções diferentes no mesmo bloco `catch`, facilitando a legibilidade e manutenção do código.  
Essa sintaxe é chamada de **multi-catch** e permite capturar exceções que **não estão na mesma hierarquia de herança** em um único bloco, separando os tipos por `|` (pipe).

### Exemplo de uso

```java
try {
    // código que pode lançar diferentes exceções
} catch (SQLException | FileNotFoundException e) {
    System.out.println("Tratando SQLException ou FileNotFoundException");
}
```

No exemplo acima, tanto `SQLException` quanto `FileNotFoundException` podem ser capturadas pelo mesmo bloco, desde que não sejam da mesma linha de herança.
Quando usar?

Use multi-catch quando você deseja dar o mesmo tratamento para diferentes tipos de exceção que não têm relação de herança direta.
Exemplo prático:

```java
try {
    // código que pode lançar IllegalArgumentException ou ArithmeticException
} catch (IllegalArgumentException | ArithmeticException e) {
    System.out.println("Tratamento igual para IllegalArgumentException e ArithmeticException");
}
```

### Regras importantes:

Não pode usar multi-catch para exceções que têm relação de herança direta (por exemplo, Exception | IOException não é permitido, pois IOException é filha de Exception).
A variável de exceção (e no exemplo) é final dentro do bloco, ou seja, você não pode atribuir um novo valor a ela.
O multi-catch serve para simplificar o código quando o tratamento das exceções é igual.

### Vantagens:

Código mais limpo e legível.
Evita duplicação de código quando o tratamento é o mesmo para diferentes exceções.

---

## Try with Resources em Java
### O que é Try with Resources?

O **try with resources** é uma estrutura introduzida no Java 7 para facilitar o gerenciamento automático de recursos, como arquivos, conexões de banco de dados, sockets, etc.  
Recursos são objetos que precisam ser fechados após o uso para liberar memória e evitar vazamentos.  
Com o try with resources, o Java garante que esses recursos serão fechados automaticamente ao final do bloco `try`, mesmo que ocorra uma exceção.

### Como funciona?

Para usar o try with resources, basta declarar os recursos entre parênteses logo após o `try`.  
Esses recursos **devem implementar a interface `AutoCloseable`** (ou `Closeable`, que herda de `AutoCloseable`).  
Ao final do bloco, o método `close()` de cada recurso é chamado automaticamente pelo Java.

#### Exemplo:

```java
try (BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"))) {
    String linha;
    while ((linha = br.readLine()) != null) {
        System.out.println(linha);
    }
} catch (IOException e) {
    e.printStackTrace();
}
// O BufferedReader será fechado automaticamente aqui, mesmo se ocorrer uma exceção.
```
### Métodos para ler arquivos:
1. Usando try with resources (moderno e recomendado):

```java
private static void readFile() {
    try (Reader1 reader1 = new Reader1();
         Reader2 reader2 = new Reader2()) {
        // Use os recursos aqui
    } catch (IOException e) {
        // Trate exceções aqui
    }
}
```

`Reader1` e `Reader2` são exemplos de recursos que implementam AutoCloseable.
O método close() de ambos será chamado automaticamente ao final do bloco.

2. Usando try-catch-finally (antigo):

````java
private static void readFile2() {
    Reader reader = null;
    try {
        reader = new BufferedReader(new FileReader("text.txt"));
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } finally {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
````
Antes do Java 7, era necessário fechar manualmente os recursos no bloco finally.
Isso deixava o código mais verboso e sujeito a erros, como esquecer de fechar o recurso ou não tratar exceções corretamente.

### Vantagens do Try with Resources:

- Menos código e mais legibilidade: Não precisa de bloco `finally` para fechar recursos.
- Mais seguro: Garante o fechamento dos recursos, mesmo se ocorrer uma exceção.
- Evita vazamento de recursos: Reduz o risco de esquecer de fechar arquivos, conexões, etc.
- Permite múltiplos recursos: Você pode declarar vários recursos no mesmo bloco try, separados por ponto e vírgula.

### Detalhes importantes:

- A ordem de fechamento dos recursos é inversa à ordem de declaração.
Ou seja, o último recurso declarado é fechado primeiro.
- Se o método close() lançar uma exceção, ela será suprimida, mas pode ser acessada via Throwable.getSuppressed() na exceção principal.
- Você pode usar qualquer classe que implemente AutoCloseable (incluindo recursos próprios).

### Resumo:

O `try with resources` é a forma mais moderna, segura e recomendada de trabalhar com recursos em Java.
Sempre que for manipular arquivos, conexões ou qualquer objeto que precise ser fechado, prefira essa abordagem.

---

## Exceções Customizadas em Java

### O que são exceções customizadas?

Exceções customizadas são classes de exceção criadas pelo próprio desenvolvedor para representar situações específicas da sua aplicação, tornando o tratamento de erros mais claro e organizado.

### Por que criar exceções customizadas?

- Para indicar erros de negócio ou regras específicas do seu sistema.
- Para tornar o código mais legível e fácil de manter.
- Para diferenciar falhas técnicas (como `NullPointerException`) de falhas de negócio (como `SaldoInsuficienteException`).

### Como criar uma exceção customizada?

Basta criar uma nova classe que **herda de `Exception`** (para exceções checadas) ou de **`RuntimeException`** (para exceções não checadas).

#### Exemplo de exceção customizada:

```java
public class LoginInvalidException extends Exception {
    public LoginInvalidException(String message) {
        super(message);
    }
}
```

### Como lançar e capturar:

```java
public void login(String username, String password) throws LoginInvalidException {
    if (!"admin".equals(username) || !"123".equals(password)) {
        throw new LoginInvalidException("Usuário ou senha inválidos!");
    }
}
''
try {
    login("user", "wrongpass");
} catch (LoginInvalidException e) {
    System.out.println(e.getMessage());
}
```

### Dicas:

- Use exceções customizadas para deixar claro o motivo do erro.
- Sempre forneça uma mensagem descritiva ao lançar a exceção.
- Prefira herdar de Exception para exceções de negócio (checadas) e de RuntimeException para erros inesperados (não checadas).

---

## Exceções e Regras de Sobrescrita de Métodos em Java

### Contexto:

Quando você trabalha com herança em Java, pode sobrescrever métodos da superclasse em uma subclasse. Se esses métodos lançam exceções (usam `throws`), existem regras específicas sobre o que pode ou não ser declarado na subclasse. Entender essas regras é fundamental para evitar erros de compilação e para escrever código robusto e seguro.

### Regras detalhadas:

#### 1. **Você pode remover exceções checadas na sobrescrita**

Se o método da superclasse declara exceções checadas (por exemplo, `throws IOException`), o método sobrescrito na subclasse **pode declarar menos exceções** ou até **nenhuma exceção**.  
Isso é útil quando a implementação da subclasse não precisa mais lançar aquela exceção.

**Exemplo:**
```java
class Pessoa {
    public void salvar() throws IOException, LoginInvalidException {
        // implementação
    }
}

class Funcionario extends Pessoa {
    @Override
    public void salvar() {
        // implementação que não lança exceção
    }
}
```

#### 2. Você pode lançar exceções checadas mais específicas

O método sobrescrito pode lançar exceções que são subclasses das exceções declaradas na superclasse.
Isso permite especializar o tratamento de erros na subclasse.

Exemplo:

```java
class Pessoa {
    public void salvar() throws Exception {
        // implementação
    }
}

class Funcionario extends Pessoa {
    @Override
    public void salvar() throws FileNotFoundException {
        // implementação
    }
}
```

Aqui, FileNotFoundException é filha de Exception, então é permitido.
#### 3. Você NÃO pode lançar exceções checadas mais genéricas ou novas

O método sobrescrito não pode lançar exceções checadas que não estejam presentes (nem como superclasse, nem como filha) na declaração do método da superclasse.
Ou seja, não pode adicionar exceções novas ou mais genéricas.

#### Exemplo:

```java
class Pessoa {
    public void salvar() throws FileNotFoundException {
        // implementação
    }
}

class Funcionario extends Pessoa {
    // ERRO: Exception é mais genérica que FileNotFoundException
    @Override
    public void salvar() throws Exception {
        // implementação
    }
}
```

#### 4. Exceções não checadas (unchecked) podem ser adicionadas livremente

Você pode adicionar exceções do tipo RuntimeException (e suas filhas) na sobrescrita, mesmo que não estejam na superclasse.
Isso porque exceções não checadas não precisam ser declaradas nem tratadas.

Exemplo:

```java
class Pessoa {
    public void salvar() throws IOException {
        // implementação
    }
}

class Funcionario extends Pessoa {
    @Override
    public void salvar() throws IOException, IllegalArgumentException {
        // implementação
    }
}
```
Aqui, IllegalArgumentException é unchecked, então é permitido.

### Resumo das regras de sobrescrita de exceções

- **Se o método da superclasse lança uma exceção checada (ex: `IOException`):**
    - O método sobrescrito pode lançar a mesma exceção, uma exceção mais específica (subclasse) ou nenhuma exceção.
    - **Não pode** lançar exceções mais genéricas (ex: `Exception`) ou novas exceções checadas que não estavam na superclasse.

- **Se o método da superclasse lança uma exceção genérica (ex: `Exception`):**
    - O método sobrescrito pode lançar a mesma exceção, uma exceção mais específica (subclasse) ou nenhuma exceção.
    - **Não pode** lançar exceções mais genéricas (ex: `Throwable`) ou novas exceções checadas que não estavam na superclasse.

- **Se o método da superclasse não lança exceção checada:**
    - O método sobrescrito **não pode** lançar exceções checadas novas.
    - Pode lançar exceções não checadas (`RuntimeException` e suas filhas) à vontade.

#### Exemplos práticos:

```java
// Superclasse lança IOException
public void salvar() throws IOException {}

// Subclasse pode:
@Override
public void salvar() throws IOException {} // OK
@Override
public void salvar() throws FileNotFoundException {} // OK (subclasse de IOException)
@Override
public void salvar() {} // OK (nenhuma exceção)

// Subclasse NÃO pode:
@Override
public void salvar() throws Exception {} // ERRO (mais genérica)
@Override
public void salvar() throws SQLException {} // ERRO (nova exceção checada)
 ```

```java
// Superclasse não lança exceção checada
public void salvar() {}

// Subclasse pode:
@Override
public void salvar() throws RuntimeException {} // OK (unchecked)

// Subclasse NÃO pode:
@Override
public void salvar() throws IOException {} // ERRO (checked)
```

Essas regras garantem que o código que usa referências da superclasse não seja surpreendido por exceções inesperadas.
Se a subclasse pudesse lançar exceções novas ou mais genéricas, o código cliente teria que tratar exceções que não estavam previstas na assinatura original.
Dicas práticas

Se a subclasse não precisa lançar exceções, pode omitir o throws.
Sempre que possível, especialize (torne mais específica) a exceção na subclasse.
Nunca adicione exceções checadas novas na sobrescrita.