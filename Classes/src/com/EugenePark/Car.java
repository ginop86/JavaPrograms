package com.EugenePark;

public class Car {

    //characteristics of car
    // the key word private means: don't allow these variables to be accessible outside of this Car class.
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //the whole point in setting methods in different classes is to not overwrite them in the Main Class.

    //a public method
    //this method updates the model variable. It SETS the model variable to whatever we want.
    public void setModel(String model){
        this.model = model;
    }
    // Notice the key work 'void' is not being used. Because this method is returning something. This method GETs the model variable.
    public String getModel() {
        return this.model;
    }

}
