package com.revature.abstractions;

import com.revature.interfaces.Alive;
import com.revature.interfaces.Claws;
import com.revature.interfaces.WaggingTail;

public class Cat extends Animal implements Claws, Alive, WaggingTail{

    private int numberOfLives; // Animal.numberOfLives -- is shadowed by this declaration
    private String breed;
    private boolean hasFur;

    public Cat() {
        super(); //invocation of the super classes no arg constructor
        System.out.println("Cat no-args constructor called!");
        this.numberOfLives = 9;
        this.breed = "Domestic shorthair";
        this.hasFur = true;

    }

    public Cat(int numberOfLives, String breed, boolean hasFur) {
        super();
        // this(); cannot include both super and this bc they are required to be the first line
        System.out.println("Cat parameterized constructor called!");
        this.numberOfLives = numberOfLives;
        this.breed = breed;
        this.hasFur = hasFur;
    }

    public int getAnimalNumberOfLives() {
        return super.numberOfLives;
    }

    @Override //overridden because animal also declares a method with the same name
    public int getNumberOfLives() {
        return this.numberOfLives; // returns the cat number of lives, if we called super.numberOfLives it weuld
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
        this.numberOfLives--; // side effect, actually affects something
    }

    @Override
    public void scratch() {
        System.out.println("I scratched you with my "+howLongAreClaws+" inch long claws.");
    }

    @Override
    public void wag() {
        System.out.println("I wag my tail");
    }

//    @Override
//    public int dig() {
//        return 0;
//    }
}
