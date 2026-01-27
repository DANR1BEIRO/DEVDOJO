package academy.devdojo.maratonajava.javacore.ZZD_Optional.test;

import academy.devdojo.maratonajava.javacore.ZZD_Optional.domain.Manga;
import academy.devdojo.maratonajava.javacore.ZZD_Optional.repository.MangaRepository;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalTest02 {
    static void main() {
        // Se o título existir, atualiza
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Berserk");
        mangaByTitle.ifPresent(m -> m.setTitle("Berserk 2"));
        System.out.println(mangaByTitle);

        // throw uma exception se o id não existir
        Manga manngaById = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(manngaById);

        // caso não existe, cria um novo
        Manga newManga = MangaRepository.findByTitle("Berserk")
                .orElseGet(() -> new Manga(3, "Dragon Ball", 300));
        System.out.println(newManga);

    }
}
