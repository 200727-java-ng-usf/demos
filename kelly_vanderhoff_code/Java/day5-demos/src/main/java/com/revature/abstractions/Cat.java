package com.revature.abstractions;

public class Cat extends Animal implements Claws, Alive, WaggingTail {

    private int numberOfLives; // Animal.numberOfLives is shadowed by this declaration
    private String breed;
    private boolean hasFur;

    public Cat() {
        // a call to super() is implicit, no need to type it out
        super(); // invocation of the super class's no-args constructor
        System.out.println("Cat no-args constructor called!");
        this.numberOfLives = 9;
        this.breed = "Domestic shorthair";
        this.hasFur = true;
        value = "cat value";
        thing = "cat toy";
    }

    public Cat(int numberOfLives, String breed, boolean hasFur) {
        super();
//        this(); // cannot include both super() and this(); b/c both are required to be the first line when used

		System.out.println("Cat parameterized constructor called!");
        this.numberOfLives = numberOfLives;
        this.breed = breed;
        this.hasFur = hasFur;
        value = "cat value";
        thing = "cat toy";
    }

    public int getAnimalNumberOfLives() {
        return super.getNumberOfLives(); // returns 1 (the default value of numberOfLives for Animal class)
    }

	@Override // overridden because Animal also declares a method with the same name
    public int getNumberOfLives() {
        return numberOfLives;
    }

    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean hasFur() {
        return hasFur; // add "this" anytime you want to be more explicit
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow.");
        this.numberOfLives--; // this is a side effect
    }

    @Override
    public void wag() {
        System.out.println("The cat flicks its tail back and forth.");
    }

    @Override
    public void scratch() {
        System.out.print("The cat scratched you with its ");
        System.out.println(howLongAreClaws + " cm claws.  Ouch!");
    }
}
