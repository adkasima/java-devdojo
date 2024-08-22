package academy.devdojo.maratonajava.javacore.Gassociation.test;

import academy.devdojo.maratonajava.javacore.Gassociation.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player1 = new Player("Aspas");
        Player player2 = new Player("Faker");
        Player player3 = new Player("Nextage");
        Player[] players = {player1, player2, player3};
        for (Player player : players) {
            player.print();
        }

    }

}
