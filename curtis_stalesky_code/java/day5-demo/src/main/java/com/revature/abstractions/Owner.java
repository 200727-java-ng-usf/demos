package com.revature.abstractions;

public class Owner extends Animal {

    Cat pet;

    @Override
    public void makeSound(){
        pet.makeSound();
    }

    public Owner(Cat pet){

    }

    public Owner(){

    }

    public Owner(int lives){

    }

    public int countLives(){
        return 1+this.pet.getNumberOfLives();
    }
}
