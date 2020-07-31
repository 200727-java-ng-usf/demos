package com.revature.abstractions;

public class Cat extends Animal {

    private int numberOfLives; // Animal.numberOfLives is shadowed by this declaration
    private String breed;
    private boolean hasFur;

    public Cat() {
        System.out.println("cat constructor called");
        this.numberOfLives = 9;
        this.breed = "Domestic short hair";
        this.hasFur = true ;
    }

    public Cat(int numberOfLives, String breed, boolean hasFur) {
        System.out.println( " Cat constructor called");
        this.numberOfLives = numberOfLives;
        this.breed = breed;
        this.hasFur = hasFur;
        value = "Cat value";
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

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    @Override
    public void makeSound() {

        System.out.println("Meow");
    }
}
