package com.revature.abstractions.cat;


public class Owner extends Animal {

    Cat pet;

    @Override
    public void makeSound() {
        pet.makeSound();
    }

    public Owner(Cat pet) {
        super();
        this.pet = pet;
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
