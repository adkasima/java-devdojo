package academy.devdojo.maratonajava.javacore.Dconstructors.test;

import academy.devdojo.maratonajava.javacore.Dconstructors.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        //Instanciando com parâmtros obrigatórios
        Anime anime = new Anime("Cyberpunk: Edgerunners",
                "Streaming",
                12,
                "Action",
                "Trigger");

        anime.print();
    }
}
