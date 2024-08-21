package academy.devdojo.maratonajava.javacore.Cmethodsoverload.test;

import academy.devdojo.maratonajava.javacore.Cmethodsoverload.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
//        anime.setType("Streaming");
//        anime.setEpisodes(12);
//        anime.setGenre("Action");
        anime.init("Cyberpunk: Edgerunners",
                "Streaming",
                12,
                "Action");
        anime.print();
    }
}
