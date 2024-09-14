package academy.devdojo.maratonajava.javacore.Fstaticmodifiers.domain;

public class Anime {
    private String name;
    private static int[] episodes;

    //0 - Bloco de inicialização estático é executado quando a JVM carregar a classe
    //1 - Alocado espaço em memória pro objeto
    //2 - Cada atributo da classe é criado e inicializado com valores default ou seja qual for
    //3 - Bloco de inicialização é executado
    //4 - Construtor é executado
    static {
        System.out.println("on static initialization block 1");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;

        }
    }

    static {
        System.out.println("on static initialization block 2");

    }

    static {
        System.out.println("on static initialization block 3");

    }

    {
        System.out.println("on not static initialization block");
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode : Anime.episodes) {
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
