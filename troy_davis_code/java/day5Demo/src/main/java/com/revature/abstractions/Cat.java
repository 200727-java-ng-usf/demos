package com.revature.abstractions;

public class Cat extends Animal{

    private int numberOfLives; //Animal.numberOfLives is shadowed by this declaration
    private String breed;
    private boolean hasFur;


    public Cat() {
        //a call to super is implicit, no need to type it out
        super(); //invocation of the super classes no args constructor
        System.out.println("Cat constructor called");
        this.numberOfLives = 9;
        this.breed = "Domestic short";
        this.hasFur = true;
        value = "cat value";
    }

    public Cat(int numberOfLives, String breed, boolean hasFur) {
        //this(); cannot include both this() and super() because both are req to be the first line
        super();
        System.out.println("Cat parameterized constructor called");
        this.numberOfLives = numberOfLives;
        this.breed = breed;
        this.hasFur = hasFur;
        value = "cat value";
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    public int getAnimalNumberOfLives(){
        return super.getNumberOfLives();
        //returns 1 because it is calling the animal number of lives
    }
    @Override //overridden because animal also declres a method with the same name
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

    public boolean HasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "numberOfLives=" + numberOfLives +
                ", breed='" + breed + '\'' +
                ", hasFur=" + hasFur +
                ", numberOfLives=" + numberOfLives +
                '}';
    }
}
