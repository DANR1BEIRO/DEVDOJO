package academy.devdojo.maratonajava.javacore.C_OverloadingMethods.domain;

public class Anime {
    private String name;
    private String type;
    private int episode;
    private String genre;


    public void init(String name, String type, int episode) {
        this.name = name;
        this.type = type;
        this.episode = episode;
    }

    public void init(String name, String type, int episode, String genre) {
        this.init(name, type, episode);
        this.genre = genre;
    }

    public void print() {

        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Episode: " + this.episode);
        System.out.println("Genre: " + this.genre);

    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
