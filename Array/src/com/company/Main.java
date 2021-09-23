package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] myIntArray;
        myIntArray = new int[10];

        //myIntArray[5]=50;



        public static void printArray(int[] myIntArray) {
            for (int i = 0; i < myIntArray.length; i++) {
                myIntArray[i] = i*10;
                System.out.println("Array Element " + i + " " + myIntArray[i]);
            }
        }


    }
}
