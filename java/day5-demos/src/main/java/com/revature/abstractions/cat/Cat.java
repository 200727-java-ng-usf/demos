package com.revature.abstractions.cat;

public class Cat extends Animal implements Claws, Alive, WaggingTail {

    // Animal.numberOfLives is shadowed by this declaration
    private int numberOfLives;
    private String breed;
    private boolean hasFur;

    public Cat() {
        // a call to super() is implicit, no need to actually type it out
        super(); //invocation of the super class's no-args constructor
        System.out.println("Cat no-args constructor called!");
        this.numberOfLives = 9;
        this.breed = "Domestic shorthair";
        this.hasFur = true;
    }

    public Cat(int numberOfLives, String breed, boolean hasFur) {
        super();
        // this(); cannot include both super() and this(); both are required to be the first line if used
        System.out.println("Cat parameterized constructor called!");
        this.numberOfLives = numberOfLives;
        this.breed = breed;
        this.hasFur = hasFur;
    }

    @Override // overridden because Animal also declares a method with the same name
    public int getNumberOfLives() {
        return this.numberOfLives;
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

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow.");
        this.numberOfLives--; // side effect
    }

    @Override
    public void scratch() {
        System.out.println("I scratched you with my " + howLongAreClaws + " long claws");
    }

    @Override
    public void wag() {
        System.out.println("I whip my tail back and forth");
    }
}
