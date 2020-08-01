package com.revature.abstractions;

public class Cat extends Animal implements Claws, Alive, WaggingTail{

    private int numberOfLives; // Animal.numberOfLives is hadowed by this declaration
    private String breed;
    private boolean hasFur;

    public Cat() {
        // a call to super() is implicit, no need to actually type it out
        super(); // invocation of the super class's no-args constructors
        System.out.println("Cat constructor called!");
        this.numberOfLives = 9;
        this.breed = "Domestic shorthair";
        this.hasFur = true;
        value = "cat value";
        thing = "cat toy";
    }

    public Cat(int numberOfLives, String breed, boolean hasFur) {
        super();
        //this(); cannot include both super() and this(); b/c both are required to be the first line if used
        System.out.println("Cat parameterized constructor called!");
        this.numberOfLives = numberOfLives;
        this.breed = breed;
        this.hasFur = hasFur;
    }

    public int getAnimalOfLives() {
        return super.numberOfLives; // returns 1 (the default value of numberOfLines in Animal)
    }

    @Override // overridden because Animal also declares a method with the same name
    public int getNumberOfLives() {
        return this.numberOfLives; // returns w/e the value of Cat.numberOfLives is - default = 9
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
       return this.hasFur = hasFur;  // add "this" anytime you want to be more explicit

    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    @Override
    public void makeSound() {

        System.out.println("Meow.");
        this.numberOfLives--; // side effect

    }


    public void scratch() {
        System.out.println("I scratched you with my" + howLongAreClaws + "Claws");
    }


    public void scratch2() {

    }

    @Override
    public void wag() {
        System.out.println("I whip my tail back and forth I whip my tain back and forth");
    }
}
