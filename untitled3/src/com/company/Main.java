package com.company;

public class Main {

    public static void main(String[] args) {
        double a = calculateScore("Tom",2);
        int b = calculateScore(3);
        System.out.println(a);
        System.out.println(b);
    }

    public static double calculateScore (String playerName, double finalScore) {
        System.out.println(playerName + finalScore);
        return finalScore;
    }
    public static int calculateScore ( int finalScore) {
        System.out.println(finalScore);
        return finalScore;
    }

}
