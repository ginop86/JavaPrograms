package com.EugenePark;

public class Main {

    public static void main(String[] args) {
        /*
        using the 'new' key word initialize the new object
         */
        Car bmw = new Car();
        Car honda = new Car();

        bmw.setModel("7 Series");
        System.out.println("Model is " + bmw.getModel());

    }
}
