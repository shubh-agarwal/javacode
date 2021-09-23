package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
      //  int[] myVariable = new int[25];
        //{1,2,3,4,5,6,7,8,9,10};
        //  myVariable =
      //  for (int i = 0; i < myVariable.length; i++) {
       //     myVariable[i] = i;
       //    System.out.println(i);
        Random rand = new Random();
        for (int i=1; i <=10;i++ ) {
            int A = (rand.nextInt(699) + 100);
            int B = (rand.nextInt(899) + 100);
            int C = (rand.nextInt(8999) + 1000);
            System.out.println(A + "-" + B + "-" + C);
            //andomPhoneNumber.getNumber1();
        }
        }

}
