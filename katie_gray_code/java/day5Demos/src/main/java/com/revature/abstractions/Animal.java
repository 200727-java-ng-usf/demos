package com.revature.abstractions;

/*
    - Cannot be instantiated directly, must have a concrete implementation
      by means of one or more subclasses
      + All abstract methods must be implemented by concrete subclasses.

    - Still has constructors because subclasses will leverage these for their own instantiation

    - Can have zero or more non abstract methods contained within its declaration
        + abstract methods are simply methods that do not have implementation,
          they are also called "method stubs"

 */

public abstract class Animal {

    public int numberOfLives = 1;
    // protected declarations are visible to any class in the same package, and subclasses anywhere in the app
    protected String value = "somevalue";

    public Animal(){
        super();
        System.out.println("Animal Constuctor Called!");

    }

    public Animal(int lives){
        numberOfLives = lives;
    }
    // concrete method, meaning it has an implementation; not required to be overridden
    // by subclasses - though they can if they choose (unless declared final)
    public int getNumberOfLives(){
        return numberOfLives;
    }
    /*
        Abstract method, aka method stub, all concrete method subclasses
        will be required to override this method to provide an implementation
     */
    public abstract void makeSound();

}
