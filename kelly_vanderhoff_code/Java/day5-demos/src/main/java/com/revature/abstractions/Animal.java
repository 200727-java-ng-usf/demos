package com.revature.abstractions;

	/*
		Abstract classes
		
			- Cannot be instantiated directly, must have a concrete implementation
			  by means of one or more subclasses.
			    + all abstract methods must be implemented by concrete subclasses
				
			- Still has constructors, because subclasses will leverage these for their own
			  instantiation.
			  
			- Can have zero or more abstract methods contained within its declaration
				+ abstract methods are simply methods that do not have an implementation,
				  also called "method stubs"
				  
	*/

public abstract class Animal {
	
    public int numberOfLives = 1;

    // protected declarations are accessible to any class in the same package, and subclasses anywhere in the app
	protected String value = "some value";

	// package-private (default) declarations are ONLY visible to types in the same package
	String thing = "toy";
	
	public Animal() {
		super();
		System.out.println("Animal constructor called!");
	}
	
	public Animal(int lives) {
		numberOfLives = lives;
	}

	// concrete method, meaning it has an implementation; not required to be overriden
	// by subclasses - though they can if they choose (unless declared final)
    public int getNumberOfLives() {
        return numberOfLives;
    }

	// abstract method, also known as a method stub; all concrete subclasses will be
	// required to override this method to provide an implementation.
    public abstract void makeSound();

	public void exists() {
		System.out.println("The animal exists...");
	}
}
