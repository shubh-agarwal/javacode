package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double val1 = 80d;
        double val2 = 100d;
        double val3 = (val1+val2)*100;
        System.out.println(val3);
        double val4 = val3%4;
        System.out.println(val4);

        if (val4 ==0) {
            boolean val5 = true;
        }
        boolean val6 = (val4==0) ? true :false;
    }
}
