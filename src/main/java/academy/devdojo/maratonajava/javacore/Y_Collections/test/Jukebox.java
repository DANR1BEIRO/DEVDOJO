package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import academy.devdojo.maratonajava.javacore.Y_Collections.domain.Song;

import java.util.Collections;
import java.util.List;

public class Jukebox {
    static void main() {
        new Jukebox().go();
    }

    public void go() {
        List<Song> listOfSongs = MockSongs.getSongs();
        System.out.println("Sem ordenação: " + listOfSongs);

        Collections.sort(listOfSongs);
        System.out.println("Lista ordenada pelo título: " + listOfSongs);

        listOfSongs.sort(new ArtistCompare());
        System.out.println("Lista ordenada pelo artista: " + listOfSongs);
    }
}
