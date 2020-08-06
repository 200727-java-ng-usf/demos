/*package com.revature.abstractions;
public class Cat extends Animal implements Claws, Alive, WaggingTail {
    private int numberOfLives; // Animal.numberOfLives is shadowed by this declaration
    private String breed;
    private boolean hasFur;
    public Cat() {
        super(); // invocation of the super class's no-args constructor
        System.out.println("Cat no-args constructor called!");
        this.numberOfLives = 9;
        this.breed = "Domestic shorthair";
        this.hasFur = true;
    }
    public Cat(int numberOfLives, String breed, boolean hasFur) {
        System.out.println("Cat parameterized constructor called!");
        this.numberOfLives = numberOfLives;
        this.breed = breed;
        this.hasFur = hasFur;
    }
    @Override // overridden because Animal also declares a method with the same name
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
    public void makeSound() {
        System.out.println("Meow!");
        this.numberOfLives--; //side effect
    }

    @Override
    public void scratch(){
        System.out.println("I scratched you with my " +howLongAreClaws+"long claws");
    }


    }
}
*/
