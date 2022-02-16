package com.company;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("shiv", 267);
        Player player2 = new Player("bhav", 125);
        Player player3 = new Player("rak", 325);
        Player player4 = new Player("ari", 325);
        Player player5 = new Player("arman", 325);

        Player[] player = { player1, player2, player3, player4, player5 };
        ComparePlayers cmp = new ComparePlayers();

        Arrays.sort(player, cmp);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
