package com.revature.abstractions;


/*
    Abstract classes
    - cannot be instantiated directly, must have a concrete implementation
      by means of one or more subclasses
        +  All abstract methods must be implemented by concrete subclasses

    - still has constructors, because subclasses will leverage these for their own
      instantiation

    - abstract method (method stub) or non abstract method
    - can have zero or more abstract methods within its declaration
        + abstract methods are simply methods that do not have an implementation
        + also called "method stubs"
    - Abstact classes have constructors
 */
public abstract class Animal {

    public int numberOfLives = 1;

    //protected declarations are visible to any class in the same package and subclasses anywhere in the path
    protected String value = "";

    //package prite
    String thing;
    public Animal(){
        super();
        System.out.println("Animal constructor called");
    }
    public Animal(int lives){
        numberOfLives = lives;
    }

    // concrete method, meaning it has an implementation: not requiredto be overridden
    // by subclasses - though they can if they chose (unless declared FINAL)
    public int getNumberOfLives(){
        return numberOfLives;
    }

    /*
        abstract - non-access modifier
        Abstract method also known as a method stub:
        all concrete subclassees will be required to override this methos to
        provide an implementation.
        any sublass must implement or be declared abstract
     */
    public abstract void makeSound();


}
