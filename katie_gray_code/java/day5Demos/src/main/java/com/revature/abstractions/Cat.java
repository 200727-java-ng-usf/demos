package com.revature.abstractions;

public class Cat extends Animal {

    private int numberOfLives; //Animal.numberOfLives is shadowed by this declaration
    private String breed;
    private boolean hasFur;

    public Cat() {
        super(); // this call is implicit
        System.out.println("Cat no-arg constructor called");
        this.numberOfLives = 9;
        this.breed = "Domestic Short Hair";
        this.hasFur = true;
    }

    public Cat(int numberOfLives, String breed, boolean hasFur) {
        System.out.println("Cat parameterized constructor called");
        this.numberOfLives = numberOfLives;
        this.breed = breed;
        this.hasFur = hasFur;
    }

    @Override //overridden bc Animal also declares method with the same name
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

    public void makeSound() {
        System.out.println("Meow.");
    }
}
