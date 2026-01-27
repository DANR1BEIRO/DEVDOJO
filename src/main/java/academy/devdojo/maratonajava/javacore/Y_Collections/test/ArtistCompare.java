package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import academy.devdojo.maratonajava.javacore.Y_Collections.domain.Song;

import java.util.Comparator;

public class ArtistCompare implements Comparator<Song> {
    @Override
    public int compare(Song s1, Song s2) {
        return s1.getArtist().compareTo(s2.getArtist());
    }
}
