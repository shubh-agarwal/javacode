package com.company;

public class Car extends Vehicle{
    private String gearType;

    public String getGearType() {
        return gearType;
    }

    public Car(int wheels, int gears, String gearType) {
        super(0,0,wheels, gears);
        this.gearType = gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }
}

