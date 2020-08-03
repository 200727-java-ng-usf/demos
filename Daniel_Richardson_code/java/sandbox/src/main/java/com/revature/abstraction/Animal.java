package com.revature.abstraction;

/*
    Abstract class, can't be instantiated. Needs concrete implementation
    by means subclasses.
        -abstract methods must be implemented by concrete subclasses
        -still has constructors, to be used by subs
    May have zero+ abstract methods(methods without implementations)(method stubs)

 */

public abstract class Animal {
    public int numberOfLives = 1;

    public Animal(){
        super();
        System.out.println("Animal constructor called");

    }
    public Animal(int lives){   //concrete  class
        numberOfLives = lives;
    }
    public int getNumberOfLives(){
        return numberOfLives;
    }
    public abstract void makeSound();
    //CANNOT add a body to abstract method
    //made to allow various methods/arguments
    //subs need to override

}
