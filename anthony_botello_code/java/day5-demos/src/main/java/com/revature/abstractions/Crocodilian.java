package com.revature.abstractions;

public class Crocodilian extends Animal implements Claws, Alive, WaggingTail {

    private int numberOfLives; // Animal.numberOfLives is shadowed by this declaration
    private String species;
    private boolean isCrocodile;

    public Crocodilian() {
        // a call to super() is implicit, no need to actually type it out
        super(); // invocation of super class's no-args constructor
        System.out.println("Crocodilian no-args constructor called!");
        this.numberOfLives = 1;
        this.species = "American";
        this.isCrocodile = false;
        value = "crocodilian value"; // value is visible to 'Crocodilian' because it is inherited from 'Animal'
    }

    public Crocodilian(int numberOfLives, String species, boolean isCrocodile) {
        System.out.println("Crocodilian parameterized constructor called!");
        this.numberOfLives = numberOfLives;
        this.species = species;
        this.isCrocodile = isCrocodile;
    }

    public int getNumberOfLives() {
        return numberOfLives;
    }

    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isisCrocodile() {
        return isCrocodile;
    }

    public void setisCrocodile(boolean isCrocodile) {
        this.isCrocodile = isCrocodile;
    }

    @Override
    public void makeSound() {
        System.out.println("Hsssssssssssssss");
        this.numberOfLives++;
    }

    @Override
    public void scratch() {
        System.out.println("I scratched you with my " + howLongAreClaws + "\" claws");
    }

    @Override
    public void wag() {
        System.out.println("I whip my tail back and forth");
    }
}