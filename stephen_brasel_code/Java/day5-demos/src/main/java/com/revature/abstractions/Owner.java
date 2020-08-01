package com.revature.abstractions;

public class Owner extends Animal{

    Cat pet;

    public Owner(Cat pet) {
        super();
        this.pet = pet;
    }

    public Owner() {
        super();
        this.pet = new Cat();
    }

    public Owner(int lives){
        super(lives);
        this.pet = new Cat();
    }

    @Override
    public void makeSound() {
        pet.makeSound();
    }

    public int countLives(){
        return this.numberOfLives+this.pet.getNumberOfLives();
    }
}
