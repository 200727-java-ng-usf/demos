package com.revature.abstractions;

/*
        Abstract classes

        -Cannot be instantiated directly, must have a concrete implementation
         by means of one or more subclasses.

        - Still has constructors, because subclasses

        -Can have zero or more abstract methods contained within its declaration
            + abstract methods are methods that do not have an implementation
            also called method stubs
 */
public abstract class Animal {

    public int numberOfLives = 1 ;

    protected String value ="someValue";

    public Animal(){
        super();

        System.out.println("Animal constructor called");
    }

    public Animal(int lives){
        numberOfLives = lives ;
    }

    public int getNumberOfLives(){
        return numberOfLives;
    }

    // Abstract method, also known as a method stub ; all concrete method

    public abstract void makeSound();

}
