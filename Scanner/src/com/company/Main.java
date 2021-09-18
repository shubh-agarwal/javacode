package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numberAsString = "2018";
        System.out.println(numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number"  + " "+ number);
        numberAsString+=1;
        number+=1;
    }
}
