package com.revature.abstractions.cat;

/*
    Abstract classes

        -Cannot be instantiated directly, must be a concrete implementation by means of one or more subclasses
            + all abstract methods must be implemented by concrete subclasses

        -Still has constructors, because subclasses will leverage these for their own instantiation

        -Can have zero or more abstract methods
            + abstract methods are simply methods without any implementation
                also called "method stubs"

 */

public abstract class Animal {


    public int numberOfLives = 1;

    public Animal() {
        super();
        System.out.println("Animal constructor called!");
    }

    public Animal(int lives) {
        numberOfLives = lives;

    }

    public int getNumberOfLives() {
        return numberOfLives;
    }

    // abstract method, all concrete subclasses will be required to override this method to provide
    // an implementation.

    public abstract void makeSound();


}
