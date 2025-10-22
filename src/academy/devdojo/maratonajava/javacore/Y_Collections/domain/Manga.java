package academy.devdojo.maratonajava.javacore.Y_Collections.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String name;
    private double valor;
    private int quantidade;

    public Manga(Long id, String name, double valor) {
        this.id = Objects.requireNonNull(id, "ID não pode ser nulo");
        this.name = Objects.requireNonNull(name, "Nome não pode ser nulo");
        this.valor = Objects.requireNonNull(valor, "Valor não pode ser nulo");
    }

    public Manga(Long id, String name, double valor, int quantidade) {
        this(id, name, valor);
        this.quantidade = quantidade;
    }

    /**
     * Regras do compareTo:
     * <p>
     * Como é implementado na própria classe, o metodo
     * compara o Objeto atual (this) com o objeto passado como argumento.
     *
     * @param manga
     * @return -1 se o this for menor do que manga.
     * @return 0 se os objetos comparados forem iguais.
     * @return 1 se o this for maior do que manga.
     * As classes Wrappers e String já implementam o metodo compareTo.
     * Se o campo a ser comparado for de um tipo primitivo, deve-se chamar
     * o metodo compare da classe wrapper desse campo primitivo.
     */
    @Override
    public int compareTo(Manga manga) {
        // compara por id
        //return this.id.compareTo(manga.getId());

        // metodo compare da classe wrapper Double para comparar
        // o campo de tipo primitivo double dos objetos
        // return Double.compare(valor, manga.getValor());

        return this.name.compareTo(manga.getName());
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                '}';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
