package com.company;

import com.sun.xml.internal.ws.encoding.DataSourceStreamingDataHandler;

import java.util.Scanner;

public class Main {
    public static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i = 0;i <myIntegers.length;i++) {
            System.out.println(i + " "+ myIntegers[i]);
        }
        System.out.println("The average is" + getAverage(myIntegers));
	// write your code here
    }

    public static int[] getIntegers (int numbers) {
        System.out.println(numbers);
    int [] values = new int[numbers];

    for (int i= 0; i<values.length;i++) {
        values[i]=scanner.nextInt();
    }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i <array.length;i++) {
            sum= sum+array[i];
        }
        return (double) sum / array.length;
    }

}
