package com.revature.abstractions;

import com.revature.abstractions.Cat;

public class AbstractDriver {

    public static void main(String[] args) {
    // Animal a = new Animal(): // cannot directly instantiate abstract classes

        Cat myCat = new Cat();
        Cat yourCat = new Cat(8, "Sphinx", false);
        Cat hisCat = new Cat(5, "Persian", true);
        Cat herCat = new Cat(7, "Serval", true);

        System.out.println("+-----------");



        System.out.println("+-----------");

        System.out.println(myCat.getBreed());
        System.out.println(yourCat.isHasFur());
        System.out.println(hisCat.isHasFur());
        herCat.makeSound();

        System.out.println("+-----------");


        Animal someAnimal = new Cat(); // covariance!
        /*
            Covariance is when you have a reference of a super type that points to an object ... If methods are overridden
         */

        System.out.println(someAnimal.numberOfLives); // 1
        System.out.println(someAnimal.getNumberOfLives());
        Cat someCat = (Cat) someAnimal;
        System.out.println(someCat.getAnimalNumberOfLives());


    }
}
