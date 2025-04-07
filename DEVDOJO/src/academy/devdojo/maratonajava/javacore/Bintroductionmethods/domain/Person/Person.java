package academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Person;

public class Person {
    private String name;
    private int age;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    /**
     * O metodo `set` sempre precisará de um parâmetro do
     * mesmo tipo da variável do atributo
     *
     * @param name: parâmetro que armazena valor no atributo
     *              privado name
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Invalid age");
            return;
        }
        this.age = age;
    }

    /**
     * get não precisa de parâmetro porque ele quer pegar o
     * valor que está em memória(this.name)
     * @return: retorna o valor que foi `setado` pelo metodo `set`
     * no atributo privado this.name
     */
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

