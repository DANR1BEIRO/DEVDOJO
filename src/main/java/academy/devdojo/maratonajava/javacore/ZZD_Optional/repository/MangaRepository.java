package academy.devdojo.maratonajava.javacore.ZZD_Optional.repository;

import academy.devdojo.maratonajava.javacore.ZZD_Optional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(
            new Manga(1, "Berserk", 50),
            new Manga(2, "Overlord", 25));

    private static Optional<Manga> find(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }

    public static Optional<Manga> findById(Integer id) {
        return find(m -> m.getId().equals(id));
    }

    public static Optional<Manga> findByTitle(String title) {
        return find(m -> m.getTitle().equals(title));
    }


}
