package com.company;

public class Main {

    public static void main(String[] args) {
	// w
        // rite your code here
        int count =1;
        for (int i = 1; i <=1000; i++) {

            if (i%3 ==0 && i %5 ==0) {
                System.out.println(i + " " + count);
                count ++;

            }
            if (count > 3 ) {
                //break;
                break;
            }

        }

    }
}
