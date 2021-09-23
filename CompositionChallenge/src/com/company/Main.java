package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Wall wall1= new Wall("West");
        Wall wall2= new Wall("East");
        Wall wall3= new Wall("South");
        Wall wall4= new Wall("North");

        Cieling cieling = new Cieling(12,55);
        Bed bed = new Bed("Modern",2,13,2,2);
        Lamp lamp = new Lamp("Lamp Classic",false,5);
        Bedroom bedroom = new Bedroom("Shubh Bedroom",wall1,wall2,wall3,wall4,cieling,bed,lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}
