package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        displayHighScorePosition("Shubh",5);
    }
    public static String displayHighScorePosition ( String playerName, int position) {
        playerName= "Shubh";
        position = 5;
        String textfinal = playerName + "managed to get into position" + position;
        System.out.println(textfinal);
        return textfinal;
    }

    public static int calcHighPosition (int playerScore) {

        if (playerScore >1000) {
            return 1;
        }
        else {
            return 3;
        }
    }

}
