package com.revature.abstraction;

public class Cat extends Animal implements Claws{

    private int numberOfLives;
    private String breed;
    private boolean hasFur;

    public Cat(){
        System.out.println("Cat manifested");
        this.numberOfLives = 9;
        this.breed = "Warrior";
        this.hasFur = true;
    }

    //use alt INSERT to ezmode contructor
    public Cat(int numberOfLives, String breed, boolean hasFur) {
        this.numberOfLives = numberOfLives;
        this.breed = breed;
        this.hasFur = hasFur;
    }

    public void makeSound() {
        if(this.breed == "Cowboy"){
            System.out.println("YEEHAW BUCKAROO");
        } else {
            System.out.println("MEOW. \nGIMME FOOD. \nLEMME OUT. \nLEMME BACK IN AGAIN.");
        }
    }

    public void scratch() {
        System.out.println("Scratched.");
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

    public boolean getHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }
}
