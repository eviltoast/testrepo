package practice.hw;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Set<Player> players = new LinkedHashSet<>();
        players.add(new Player("user1", "elf", 2345));
        players.add(new Player("user2", "orc", 3456));
        players.add(new Player("user3", "undead", 4567));

        Scanner scan = new Scanner(System.in);
        System.out.println("Input username to remove");
        String inputUsername = scan.nextLine();

        Set<Player> playersWithDeletedUsers = deletePlayerByUsername(players, inputUsername);

        System.out.println(playersWithDeletedUsers);

        System.out.println("Enter username to find");
        String usernameToFind = scan.nextLine();
        findPlayersByusername(players, usernameToFind);

        scan.close();
    }

    private static Player findPlayersByusername(Set<Player> players, String inputUsername) {
        Iterator<Player> playerIterator = players.iterator();
        Player playerToBeFound = null;

        while (playerIterator.hasNext()) {
            Player exactPlayer = playerIterator.next();

            if (exactPlayer.getUsername().equalsIgnoreCase(inputUsername)) {
                System.out.println(exactPlayer);
                playerToBeFound = exactPlayer;
            }
        }
        return playerToBeFound;
    }

    private static Set<Player> deletePlayerByUsername(Set<Player> players, String inputUsername) {
        Iterator<Player> playerIterator = players.iterator();

        while (playerIterator.hasNext()) {
            Player exactPlayer = playerIterator.next();

            if (exactPlayer.getUsername().equalsIgnoreCase(inputUsername)) {
                playerIterator.remove();
            }
        }
        return players;
    }
}


