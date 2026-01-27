package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import academy.devdojo.maratonajava.javacore.Y_Collections.domain.Song;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {

    public static List<Song> getSongs() {
        List<Song> listOfSongs = new ArrayList<>();
        listOfSongs.add(new Song("Radio GaGa", "Queen"));
        listOfSongs.add(new Song("N.I.B", "Black Sabbath"));
        listOfSongs.add(new Song("Arial", "System of a down"));
        listOfSongs.add(new Song("Lux aeterna", "Metallica"));
        return listOfSongs;
    }
}
