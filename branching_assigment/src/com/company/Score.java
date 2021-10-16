package com.company;

public class Score {
    public static void main(String[] args) {
        displayHighScorePosition();
    }

    public static void displayHighScorePosition() {
        String player1 = "Janis";
        String player2 = "Alex";
        String player3 = "Peter";
        String player4 = "Georg";
        System.out.println(player1 + " managed to get into position" + calculateHighScorePosition(1500)
                + " on the high score");
        System.out.println(player2 + " managed to get into position" + calculateHighScorePosition(900)
                + " on the high score");
        System.out.println(player3 + " managed to get into position" + calculateHighScorePosition(400)
                + " on the high score");
        System.out.println(player4 + " managed to get into position" + calculateHighScorePosition(50)
                + " on the high score");
    }

    public static int calculateHighScorePosition(int Score) {
        if (Score > 1000) {
            return 1;
        } else if (Score > 500) {
            return 2;
        } else if (Score > 100) {
            return 3;
        } else {
            return 4;
        }

    }
}
