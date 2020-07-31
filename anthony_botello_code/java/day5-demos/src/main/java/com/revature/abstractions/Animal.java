package com.revature.abstractions;


/*
    Abstract classes
        - Cannot be instantiated directly, must have concrete implementation
          by means of one or more subclasses
            + All abstract methods must be implemented by concrete subclasses

        - Still has constructors, because subclasses will leverage these for their
          own instantiation

        - Can have zero or more abstract methods contained within its declaration
            + Abstract methods are emthods that do not have an implementation,
              also called "method stubs"
*/
public abstract class Animal {

    public int numberOfLives = 1;

    protected String value = "some value";  // protected fields are accessible to subclasses anywhere, or to other classes within package

    public Animal(){
        super();
        System.out.println("Animal constructor called");
    }

    public Animal(int lives){
        this();
        this.numberOfLives = lives;
    }

    // concrete method, has implementation
    // not required to be overridden, but can be overridden (unless declared final)
    public int getNumberOfLives() {
        return numberOfLives;
    }

    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    // abstract method; all concrete subclasses will be required to override it
    public abstract void makeSound();
}