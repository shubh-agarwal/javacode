package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        bankAccnt shubhAccount = new bankAccnt("4343",
                5000, "Shubh", "shubhashish.agarwa@gmail.com", "9737333909");
        shubhAccount.deposit(50);
        shubhAccount.withdrawal(40);
        shubhAccount.deposit(1000);
        vipPerson person1 =new vipPerson();
       System.out.println(person1.getName());
        vipPerson person2 = new vipPerson("Shubh",10000);
       System.out.println(person2.getName());
        vipPerson person3 = new vipPerson("VIPAllDeatails",10000,"vip@rmail.com");
        System.out.println(person3.getName()+ " " + person3.getEmail());

    }




}
