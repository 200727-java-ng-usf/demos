package com.revature.abstractions;

public abstract class Animal {

    public  int numberOfLives =1;

    public Animal() {
        System.out.println("Animal constructor called!");
    }

    public Animal(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    public int getNumberOfLives() {
        return numberOfLives;
    }

    public abstract  String makeSound();

    public void exit(){
        System.out.println("Animal Exits");
    }
}
