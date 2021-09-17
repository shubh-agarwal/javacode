package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue =10000;
        //Data ranges are there
        int myMinIntValue= Integer.MIN_VALUE;
        int myMaxIntValue=Integer.MAX_VALUE;
        System.out.println(myMaxIntValue);//max=1 will become min as
        System.out.println(myMinIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinByteValue);//max=1 will become min as
        System.out.println(myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println(myMinShortValue);//max=1 will become min as
        System.out.println(myMaxShortValue);

        long myMinLongValue = 2_333_333_333_333L;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println(myMinLongValue);//max=1 will become min as
        System.out.println(myMaxLongValue);

        byte myNewByteValue = (byte)(myMinByteValue/2);
        System.out.println(myNewByteValue);



    }
}
