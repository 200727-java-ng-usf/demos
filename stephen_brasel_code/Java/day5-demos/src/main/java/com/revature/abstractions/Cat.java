package com.revature.abstractions;

public class Cat extends Animal {

    private int numberOfLives; //Animal.numberOfLives is shadowed by this declaration
    private String breed;
    private boolean hasFur;

    public Cat() {
        // a call to super is implicit, no nered to actaully type it out
        super(); //invocation of the super class's no-args constructor
        System.out.println("Cat no-args constructor called!");
//        this.numberOfLives = 9;
        this.breed = "Demoestic shorthair";
        this.hasFur = true;
    }

    public Cat(int numberOfLives, String breed, boolean hasFur) {
        System.out.println("Cat parameterized constructor called!");
        this.numberOfLives = numberOfLives;
        this.breed = breed;
        this.hasFur = hasFur;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow.");
    }

    @Override //Overridden because Animal also declares method of the same name.
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

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }
}
