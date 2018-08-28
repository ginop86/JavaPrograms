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

    /*
    * The reason why we don't want to use the keyword 'super'
    * in the methods walk and run is because it would call the base (Animal) class instead of
    * the override method.
    * These methods would see if there was a move() method in the Dog class first and then check the base (Animal) class.
    * If we called super.move() inside the method then, the override would not work.
    * */

    public void walk() {
        System.out.println("Called from Dog class. Walk()");
        super.move(5);
    }

    public void run() {
        System.out.println("Called from Dog class. run()");
        move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Called from Dog class. Moving at " + speed + " speed.");
        super.move(20);

    }
}




