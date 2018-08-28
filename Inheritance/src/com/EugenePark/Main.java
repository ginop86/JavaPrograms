package com.EugenePark;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal", 1,1,5,5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        // Even though Dog class doesn't not have an 'eat' method, we can call this because we are extending from Animal Class
        dog.eat();

    }
}
