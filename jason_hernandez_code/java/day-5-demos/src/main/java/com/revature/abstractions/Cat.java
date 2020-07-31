package com.revature.abstractions;

public class Cat extends Animal implements Claws, Alive, TailWag{

    private int numberOfLives;
    private String breed;
    private Boolean hasFur;

    public void makeSound() {
        System.out.println("Meow.");
    }


    public Cat() {
        System.out.println("Cat parameterized constructor called.");
        this.numberOfLives = 9;
        this.breed = "Domestic shorthair";
        this.hasFur = true;
    }

    public Cat(int numberOfLives, String breed, Boolean hasFur) {
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

    public Boolean getHasFur() {
        return hasFur;
    }

    public void setHasFur(Boolean hasFur) {
        this.hasFur = hasFur;
    }

    public void scratch() {
        System.out.println("I scratched you with my " + howLongAreClaws + "cm long claws");
    }

    @Override
    public void wag() {
        System.out.println("I whip my tail back and forth!");
    }
}
