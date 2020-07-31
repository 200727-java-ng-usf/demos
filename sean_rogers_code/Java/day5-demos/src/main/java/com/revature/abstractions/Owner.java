package com.revature.abstractions;

public class Owner extends Animal {

    Cat pet;

    public Owner(Cat mockedCat) {
    }

    @Override
    public void makeSound() {
        pet.makeSound();
    }

    public Owner() {
        super();
    }

    public Owner(int lives) {
        super(lives);
    }

    public int countLives() {
        return 1+this.pet.getNumberOfLives();
    }
}
