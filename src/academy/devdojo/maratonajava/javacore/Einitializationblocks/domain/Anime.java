package academy.devdojo.maratonajava.javacore.Einitializationblocks.domain;

public class Anime {
    private String name;
    private int[] episodes;

    {
        System.out.println("on initialization block");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;

        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode : episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public int[] getEpisodes() {
        return episodes;
    }

    public String getName() {
        return name;
    }

}
