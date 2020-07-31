package com.revature.abstractions;

public class Cat extends Animal {

    private int numberOfLives; //variable shadowing
    private String breed;
    private boolean hasFur;

    public Cat() {
        super(); // invocation of the super class's no-args constructor
        System.out.println("Cat no-arg constructor called.");
        this.numberOfLives = 9;
        this.breed = "Domestic shorthair";
        this.hasFur = true;
    }

    public Cat(int numberOfLives, String breed, boolean hasFur) {
        super();
//        this(); cannot include both super() and this();
        System.out.println("Cat parameterized constructor called");
        this.numberOfLives = numberOfLives;
        this.breed = breed;
        this.hasFur = hasFur;
    }


    @Override
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
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    @Override
    public void makeSound() {
        System.out.println("MEOW.");
    }
}
