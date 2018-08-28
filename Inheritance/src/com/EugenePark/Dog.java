package com.EugenePark;

//Dog Class has every feature that Animal Class has but we can add more characteristics to Dog Class
public class Dog extends Animal{

    // Not all animals might have these characteristics but these characteristics are specific to Dog Class
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //this constructor gets created because we inherit from the Animal Class
    //initializes the base Class
    //public Dog(String name, int brain, int body, int size, int weight) {
        //the keyword super is calling the base class... in this case, Animal Class
        //super(name, brain, body, size, weight);


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        /*
        * another way to initialize the base (Animal) class.
        * Since we can assume that all Dogs have a 'brain' and a 'body' we can take it out
        * as params and just pass  in a hard value in the super method.
        * */
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("overriden from Animal Class an called from Dog class");
        //this calls the original base (Animal) class method.
        super.eat();
    }
}




