package academy.devdojo.maratonajava.javacore.D_Constructors.domain;

public class Anime {
    private String name;
    private String type;
    private int episode;
    private String genre;
    private String studio;

    public Anime(String name, String type, int episode, String genre) {
        this();
        this.name = name;
        this.type = type;
        this.episode = episode;
        this.genre = genre;
    }

    public Anime(String name, String type, int episode, String genre, String studio){
        this(name, type, episode, genre);
        this.studio = studio;
    }

    public Anime(){
        System.out.println("Dentro do construtor");
    }

    public void print() {

        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Episode: " + this.episode);
        System.out.println("Genre: " + this.genre);
        System.out.println("Studio: " + this.studio);

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
