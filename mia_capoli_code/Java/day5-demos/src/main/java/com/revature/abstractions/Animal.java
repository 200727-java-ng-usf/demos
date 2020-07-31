package com.revature.abstractions;
/*
        Abstract classes

            - Cannot be instantiated directly, must have a concrete
            implementation by means of one or more subclasses.
                + All abstract methods must be implemented by concrete subclasses

            - Stil lhas constructors, because subclasses will leverage these for their own instantiation


            - Can have zero or more abstract methods contained within its declaration
                +abstract methods are simply methods that do not have an implementation,
                 also called "method stubs"


     */
public abstract class Animal {

    public int numberOfLives = 1;

    public Animal() {
        super();
        System.out.println("Animal constructor called!");
    }

    public Animal(int Lives) {
        numberOfLives = Lives;
    }

    // concrete method, it has an implementation, not required to be overridden by subclasses,
    // but they can if they chose (unless declared final)
    public int getNumberOfLives() {
        return numberOfLives;
    }

    public abstract void makeSound();

}
