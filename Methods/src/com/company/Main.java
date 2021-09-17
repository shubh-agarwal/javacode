package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int highScore = calculateScore(3000, 1000);
        System.out.println(highScore);



    }

    public static int calculateScore(int score, int bonus) {
        // write your code here
        boolean gameOver = false;


        if (gameOver == false) {
            int finalScore = score + bonus;
            return finalScore;
        }
        return -1;
    }

}
