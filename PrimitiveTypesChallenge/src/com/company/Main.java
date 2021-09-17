package com.company;

public class Main {

    public static void main(String[] args) {
        int intValue = 50;
        byte byteValue = 10;
        short shortValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);

        short shortTotal = (short) (50000L + 10L * (byteValue + shortValue + intValue));
        System.out.println(shortTotal);

        double myFloatValue = Double.MAX_VALUE;
        float myFloat1Value = 0;


        myFloat1Value = (5f/3f);
        System.out.println(myFloat1Value);
    }
}
