package com.company;

public class isLeapYear {

    public static boolean checkYear (double year1) {
        if (year1 >=1 && year1 <=9999) {
            return true;

        }
    return false;
    }

    public static void CheckLeapYear (double year1) {
        if (checkYear(year1) == true) {

            if (year1 % 4 != 0) {
                System.out.println("This is not leap year");
            } else if (year1 % 400 == 0) {
                System.out.println("This is leap year");

            } else if (year1 % 100 == 0) {
                System.out.println("This is not leap year");
            } else {
                System.out.println("This is leap year");
            }

        }
        else {
            System.out.println("Invalid year");
        }
    }

}