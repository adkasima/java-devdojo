package academy.devdojo.maratonajava.javacore.Dconstructors.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String genre;
    private String studio;

    public Anime(String name, String type, int episodes, String genre) {
        this();
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.genre = genre;
    }

    public Anime(String name, String type, int episodes, String genre, String studio) {
        this(name, type, episodes, genre);
        this.studio = studio;
    }

    public Anime() {
        System.out.println("on constructor without arguments");

    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.genre);
        System.out.println(this.studio);

    }

}
