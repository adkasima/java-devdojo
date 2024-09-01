package academy.devdojo.maratonajava.javacore.Gassociation.test;

import academy.devdojo.maratonajava.javacore.Gassociation.domain.Player;
import academy.devdojo.maratonajava.javacore.Gassociation.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player = new Player("Aspas");
        Team team = new Team("Leviatan");

        player.setTeam(team);
        player.print();
    }
}
