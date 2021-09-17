package com.company;

public class Main {

    public static void main(String[] args) {
        int a = getDuration(65,10);
        int b = getDuration(80);
	// write your code here
    }

    public static int getDuration (int minutes, int seconds) {
        if (minutes < 0 || (seconds <0 && seconds > 59)) {
            return -1;
        }
        int hours= minutes / 60;
        minutes = minutes % 60;
        System.out.println(hours + "hours"+ minutes +"minutes " + seconds + "seconds");
        return 0;

    }

    public static int getDuration (int seconds) {
        if ((seconds <0 )) {
            return -1;
        }
        int a = seconds/60;
        int b = seconds%60;
        System.out.println(a + "minutes" +  b);
        return 0;

    }


}
