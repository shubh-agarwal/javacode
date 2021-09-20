package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car porsche = new Car();
        Car accord = new Car();
        System.out.println("Carrera" + porsche.getModel());
        porsche.setModel("Car");
        System.out.println("Carrera" + porsche.getModel());

    }
}
