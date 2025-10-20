package academy.devdojo.maratonajava.javacore.Y_Collections.domain;

import java.util.Objects;

public class Manga {
    private Long id;
    private String name;
    private String valor;

    public Manga(Long id, String name, String valor) {
        this.id = Objects.requireNonNull(id, "ID não pode ser nulo");
        this.name = Objects.requireNonNull(name, "Nome não pode ser nulo");
        this.valor = Objects.requireNonNull(valor, "Valor não pode ser nulo");
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Manga manga)) return false;
        return Objects.equals(id, manga.id) && Objects.equals(name, manga.name) && Objects.equals(valor, manga.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, valor);
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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
