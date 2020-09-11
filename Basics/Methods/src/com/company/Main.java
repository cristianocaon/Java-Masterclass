package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        String playerName = "John Mayer";
        int score = 300;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Returned final score: " + highScore);

        int position = calculateHighScorePosition(highScore);
        displayHighScorePosition(playerName, position);

        score = 500;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Returned final score: " + highScore);

        position = calculateHighScorePosition(highScore);
        displayHighScorePosition(playerName, position);
    }

    public static int calculateScore(boolean gameOver, int score,
                                      int levelCompleted, int bonus) {

        if (gameOver) {
            return (score + (levelCompleted * bonus));
        }

        return -1;  // -1 indicates value not found in searching algorithms
    }

    public static void displayHighScorePosition(String playerName, int position) {

        System.out.println("Player '" + playerName + "' managed to get into" +
                " the position number " + position);
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        } else {
            position = 4;
        }

        return position;
    }
}
