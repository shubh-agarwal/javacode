package com.company;

public class Main {

    public static void main(String[] args) {
        isPrime(120);
	// write your code here
      //  double amount = 10000;
     //   for (int i=0;i < 25; i++ ){
     //       double interest = calcCompInterest(amount, i);
      //      System.out.println("Year : " + i + "AmountEarned: " + amount + "Interest Earned :" + interest );
     //       amount = amount+interest;
      //  }

    }

    public static double calcInterest (double amount, double interest) {
        return (amount*(interest/100));
    }

    public static double calcCompInterest (double amount,double interest) {
        interest = amount*(interest/100);

        return interest;

    }

    public static boolean isPrime(int a)  {
        if (a==1) {
            return false;
        }
        int count = 1;
        for (int i = 2;i<=a;i++) {
            if (a%i==0) {

                count++;

                }
            switch (count) {
                case 3 :
                    break;


            }

        }
        System.out.println(count);
        return true;
    }

}
