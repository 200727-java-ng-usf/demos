package com.revature.abstractions;

public abstract class Animal {

    public int numberOfLives = 1;

    public Animal() {
        System.out.println("Animal constructor called");
    }
    public Animal(int lives){
        numberOfLives = lives;
    }
    public int getNumberOfLives(){
        return numberOfLives;
    }

    public abstract void makeSound();


}
