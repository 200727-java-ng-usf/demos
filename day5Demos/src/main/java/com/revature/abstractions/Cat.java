package com.revature.abstractions;

public class Cat extends Animal implements Claws {

    private int numberOfLives;
    private String breed;
    private boolean hasFur;

    public Cat() {
        System.out.println("Cat constructor called!");
        this.numberOfLives = 9;
        this.breed = "Domestic shorthair";
        this.hasFur = true;

    }

    public Cat(int numberOfLives, String breed, boolean hasFur) {
        this.numberOfLives = numberOfLives;
        this.breed = breed;
        this.hasFur = hasFur;
    }


    public String makeSound() {
        return "Meow";
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
    public void exit(){
        System.out.println("Cat running out");
    }

    @Override
    public void scratch(){
        System.out.println("do scratch");
    }
}
