package academy.devdojo.maratonajava.javacore.Dconstructors.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String genre;

    public Anime(String name, String type, int episodes, String genre) {
        System.out.println("on constructor");
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.genre = genre;
    }

    public Anime() {

    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.genre);

    }

}
