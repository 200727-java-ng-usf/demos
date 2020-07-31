package com.revature.abstractions.cat;

public class AbstractDriver {

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Cat yourCat = new Cat(8, "Sphinx", false);
        Cat hisCat = new Cat(5, "Persian", true);
        Cat herCat = new Cat(7, "Serval", true);

        Animal someAnimal = new Cat(); // covariance!

        /*
        Covariance only has access to methods of the class if they are overridden methods of
        the super. If the class has a method the super doesn't the Covariance obj will have
        to be casted. All vars will be called from the super.
         */

        System.out.println(myCat.getBreed());
        System.out.println(myCat.getNumberOfLives());
        System.out.println(someAnimal.numberOfLives);
        //1 - gets vars from animal
        System.out.println(someAnimal.getNumberOfLives() );
        //9 - method is in cat so gets cat vars
        Cat someCat = (Cat) someAnimal; //casting
        // someCat.numberOfLives; - does not work, var is private
        System.out.println(someCat.getNumberOfLives());
        System.out.println(((Cat) someAnimal).getBreed());
        //System.out.println(((Cat) someAnimal).numberOfLives); - also does not work
        // animal is casted to a cat but is trying to access a private var
        someAnimal.numberOfLives = 3;
        System.out.println(someAnimal.numberOfLives);
        myCat.scratch();
        System.out.println(myCat.dig());
        myCat.wag();

    }
}
