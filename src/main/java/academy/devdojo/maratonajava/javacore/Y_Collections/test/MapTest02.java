package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import academy.devdojo.maratonajava.javacore.Y_Collections.domain.Consumidor;
import academy.devdojo.maratonajava.javacore.Y_Collections.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    static void main() {

        Consumidor consumidor1 = new Consumidor("Goku");
        Consumidor consumidor2 = new Consumidor("Goten");

        Manga loboSolitário = new Manga(4L, "Lobo solitário", 14.55, 2);
        Manga vagabond = new Manga(2L, "Vagabond", 6.99, 5);
        Manga akira = new Manga(3L, "Akira", 20D, 2);
        Manga fullmetalAlchemist = new Manga(1L, "Fullmetal Alchemist", 15.90, 1);
        Manga dragonBall = new Manga(2L, "Dragon ball", 15.90, 0);

        Map<Consumidor, Manga> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, akira);
        consumidorMangaMap.put(consumidor2, dragonBall);

        for (Map.Entry<Consumidor, Manga> entry : consumidorMangaMap.entrySet()) {
            System.out.println(entry.getKey().getName() + " - " + entry.getValue().getName());
        }
    }
}
