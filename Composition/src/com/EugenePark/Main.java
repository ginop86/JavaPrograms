package com.EugenePark;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20,20, 5);

        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMoniter = new Monitor("27 inch", "Acer", 27, new Resolution(2540,1440));

        MotherBoard theMotherBoard = new MotherBoard("BJ-200", "Asus", 4,6, "v2.44");

        PC thePC = new PC(theCase, theMoniter, theMotherBoard);

        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();

    }
}
