package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumDigits(15667));
    }

    public static int sumDigits (int number) {
        if (number < 0) {
            return -1;
        }
        else if (number <10) {
            return number;
        }
        else {
            int remainder,sum = 0;
            while (number >= 1) {
                remainder = number % 10;
                number = number /10;
                System.out.println(remainder);
                sum= sum+ remainder;

            }
            return sum;
        }

    }
}
