package academy.devdojo.maratonajava.javacore.Y_Collections.domain;

import java.util.concurrent.ThreadLocalRandom;

public class Song implements Comparable<Song> {
    private Long id;
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.id = ThreadLocalRandom.current().nextLong(1, 10_000);
        this.title = title;
        this.artist = artist;
    }

    @Override
    public int compareTo(Song song) {
        return this.title.compareTo(song.getTitle());
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return title;
    }
}
