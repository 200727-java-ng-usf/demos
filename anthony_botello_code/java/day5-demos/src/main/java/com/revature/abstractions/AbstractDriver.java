package com.revature.abstractions;

public class AbstractDriver {

    public static void main(String[] args){

        // Animal a = new Animal();    // abstract classes cannot be directly instantiated

        Crocodilian gator = new Crocodilian();
        Crocodilian croc1 = new Crocodilian(1, "Australian", true);
        Crocodilian croc2 = new Crocodilian(1, "American", true);

        gator.makeSound();
        System.out.println(croc1.getSpecies());
        System.out.println(croc2.getNumberOfLives());
        
        /*
            Covariance is when you have a reference of a super class that points to an object
            of a subclass. This reference will have access to only the states and behaviors of
            the declared reference type. Although, if any methods of the parent are overridden
            by the subclass, the methods will behave as they do for the subclass.
        */

        Animal ghar = new Crocodilian(3, "Gharial", false);   // covariance
        System.out.println(ghar.numberOfLives); // returns the value 1 from the 'numberOfLives' field in 'Animal' class
        System.out.println(ghar.getNumberOfLives()); // returns the value of 3 by using the overridden 'getNumberOfLives' method in 'Crocodilian' class 
        // System.out.println(gator.numberOfLives);    // won't work because object declared as 'Crocodilian' reference; in this class 'numberOfLives' is private

        System.out.println(gator.value);
        System.out.println(ghar.value);
        
        gator.scratch();
    }
    
}