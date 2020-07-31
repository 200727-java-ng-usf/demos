package com.revature.abstractions;

public class Cat extends Animal {

    private int numberOfLives; // Animal.numberOfLives is shadowed by this declaration
    private String breed;
    private boolean hasFur;

    public Cat() {
        // a call to super is implicit, no nered to actaully type it out
        super(); //invocation of the super class's no-args constructor
        System.out.println("Cat no-args constructor called!");
        this.numberOfLives = 9;
        this.breed = "Demoestic shorthair";
        this.hasFur = true;
        value = "cat value";
        thing = "cat toy";
    }

    public Cat(int numberOfLives, String breed, boolean hasFur) {
        super();
//        this(); // cannots include both super() and this(); b/s both are required to be the first line if used.
        System.out.println("Cat parameterized constructor called!");
        this.numberOfLives = numberOfLives;
        this.breed = breed;
        this.hasFur = hasFur;
    }

    public int getAnimalNumberOfLives(){
        return super.numberOfLives; // returns 1 (the default value of numberOfLives in Animal
    }

    @Override //Overridden because Animal also declares method of the same name.
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

    public boolean hasFur() {
        return this.hasFur;
    }

    public void hasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow.");
    }

    @Override
    public void exist() {
        System.out.println("The cat exists...");
    }
}
