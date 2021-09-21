package com.company;

public class Vehicle {
        private int fuel;
        private int speed;
        private int wheels;
        private int gears;

    public Vehicle(int fuel, int speed, int wheels, int gears) {
        this.fuel = fuel;
        this.speed = speed;
        this.wheels = wheels;
        this.gears = gears;
    }

    public int getFuel() {
        return fuel;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWheels() {
        return wheels;
    }

    public int getGears() {
        return gears;
    }
}
