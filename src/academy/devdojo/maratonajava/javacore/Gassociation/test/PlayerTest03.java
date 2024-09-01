package academy.devdojo.maratonajava.javacore.Gassociation.test;

import academy.devdojo.maratonajava.javacore.Gassociation.domain.Player;
import academy.devdojo.maratonajava.javacore.Gassociation.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player1 = new Player("Aspas");
        Player player2 = new Player("TCK");
        Team team = new Team("Leviatan");
        Team team2 = new Team("Cloud 9");
        Player[] players = {player1};

        player1.setTeam(team);
        player2.setTeam(team2);

        team.setPlayers(players);

        System.out.println("---< Jogador >---");
        player1.print();

        System.out.println("---< Time >---");
        team.print();

    }
}
