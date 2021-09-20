package com.company;

public class vipPerson {

    private String name;
    private double creditLimit;
    private String email;

    public vipPerson() {
        this("Default Name",50000,"shubh@example.com");
    }

    public vipPerson(String name, double creditLimit) {
        this(name,creditLimit,"unknown@example.com");
    }

    public vipPerson(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public String getName() {
      return name;
   }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
