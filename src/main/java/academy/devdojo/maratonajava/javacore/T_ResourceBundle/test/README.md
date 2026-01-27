## ResourceBundle e Internacionalização

O _ResourceBundle_ é uma classe do Java usada para **gerenciar textos em diferentes idiomas**, sem 
precisar reescrever o código.

Ela permite separar o conteúdo (**as mensagens**) da lógica **(o código)**, facilitando
a tradução do sstema para vários idiomas.

### Como funciona?
- Criamos **um arquivo por idioma**, todos com o **mesmo nome base**, mas com sufixo de localização:

````java

messages.properties            → idioma padrão (fallback)
messages_en_US.properties      → inglês (EUA)
messages_pt_BR.properties      → português (Brasil)
````
- No código, usamos _ResourceBundle.getBundle("messages", locale)_ e o Java **carrega o arquivo certo automaticamente,**
com base na _Locale_.

#### key e value
Cada linha do _.properties_ é um par:

````bash
hello=olá
````
- _hello_ → **chave** usada no código
- _Olá_ → **valor traduzido** para o idioma

### Métodos importantes:

- getString("chave") → Retorna o valor como String
- getObject("chave") → Retorna como Object (útil se for outro tipo)
- getStringArray("chave") → Retorna um array de String[], **mas só funciona com** ListResourceBundle

### 🔹 .properties **vs** ListResourceBundle

- ._properties_ = só lida com texto (String). Não aceita valores como arrays ou 
objetos complexos.

- _ListResourceBundle_ (**classe Java**) = aceita String[], objetos, etc. 
É mais poderosa, mas mais verbosa.

### Como o Java sabe qual idioma usar:
Através da classe _Locale_:

````java
new Locale("pt", "BR")  // Português do Brasil
new Locale("en", "US")  // Inglês dos EUA
````
Ou com _Locale.getDefault()_ que pega o idioma do sistema.

#### Exemplo de uso:

````java
ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
System.out.println(bundle.getString("hello")); // Olá
````

z