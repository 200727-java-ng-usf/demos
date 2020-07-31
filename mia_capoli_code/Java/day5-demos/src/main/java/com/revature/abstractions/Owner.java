package com.revature.abstractions;

public class Owner extends Animal {

    Cat pet;

    @Override
    public void makeSound() {
        pet.makeSound();
    }

    public Owner() {
    }

    public Owner(Cat pet) {
        super();
        this.pet = pet;
    }

    public Owner(int Lives) {
        super(Lives);
    }

    public int countLives() {
        return 1+this.pet.getNumberOfLives();
    }
}
