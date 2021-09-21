package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(17,17,10);
        Case theCase = new Case("220B","Dell",dimensions,"240");

        Monitor monitor = new Monitor("430M","Asus",17,new Resolution(2540,1440));
        motherBoard motherBoard = new motherBoard("BJ-200","Asus",2,2,"LenovoBios");
        PC thePC = new PC (theCase,monitor,motherBoard);
        thePC.getMonitor().drawPixelAt(1500,1200,"black");
        thePC.getMotherBoard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();
    }
}
