package com.company;

public class Main {

    public static void main(String[] args) {
	// write you code here
        int switchValue = 5;
        switch (switchValue) {
            case 1:
                System.out.println("Value of 1");
                break;
            case 4:
                System.out.println("Value of 1");
                break;
            case 5: case 6: case 8:
                System.out.println("3 or 4 or 5");
            default:
                System.out.println("No value");
        }
    }
}
