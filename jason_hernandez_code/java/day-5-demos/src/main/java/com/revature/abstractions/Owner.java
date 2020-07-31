package com.revature.abstractions;

public class Owner extends Animal{
    Animal pet;

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
        
    }
}
