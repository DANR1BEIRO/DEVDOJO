package academy.devdojo.maratonajava.javacore.ZZK_JUnit.domain;

import java.util.Objects;

record Manga(String name, int episodes) {
    // Record é uma classe imutável
    // Por padrao é uma classe final - não pode ser extendida
    // Atributos não disponibilizam acesso a eles, portanto não podem ser modificados

    // Apenas atributos de instância podem ser criados em um Record

    public Manga {
        Objects.requireNonNull(name, "Name can't be null");
    }
}
