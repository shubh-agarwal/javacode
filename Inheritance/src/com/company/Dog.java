package com.company;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name,  int size, int weight,int legs,int eyes,int tail,int teeth,String coat) {
        super(name, 1, 1, size, weight);
        this.eyes= eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog eat called");
        super.eat();

    }

    public void chew() {
        System.out.println("Dog chew called");

    }

    public void walk() {
        System.out.println("Dog Walking called");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs called");
    }

    @Override
    public void move(int speed) {
        moveLegs(speed);
        super.move(speed);
    }
}
