package com.revature.abstractions;

public class AbstractDriver {
    public static void main(String[] args) {

//        Animal a;
//        a = new Animal(); // cannot directly instantiate anstract classes

        Cat myCat = new Cat();
        Cat yourCat = new Cat(9, "Sphinx", false);
        Cat hisCat = new Cat(5, "Persian", true);
        Cat herCat = new Cat(7, "Serval", true);
        System.out.println("+--------------------------------+");

        Animal someAnimal = new Cat(); // covariance!

        System.out.println("+--------------------------------+");

        System.out.println(myCat.getBreed());
        System.out.println(yourCat.hasFur());
        System.out.println(hisCat.hasFur());
        herCat.makeSound();

        /*
            Covariaance is when you have a reference of a supertype that points to an object
            of a subtype.

            This reference will have access to only the states and behaviors of
                the declared reference type. Not the object types..

            Although, if any methods of the parent are overridden by the subtype,
                those methods will behave as the do for the subtype.
         */

        System.out.println(someAnimal.numberOfLives); // 1
        System.out.println(someAnimal.getNumberOfLives()); // 9
        Cat someCat = (Cat) someAnimal;
//        someCat.numberOfLives;

        ((Cat) someAnimal).exist();
        ((Animal) someAnimal).exist();
        System.out.println(someCat.getAnimalNumberOfLives());   //1
        System.out.println(someCat.getNumberOfLives());         //9

        someAnimal.exist();
        someCat.exist();

        System.out.println(someAnimal.value);
        myCat.scratch();
        myCat.wag();
    }

}
