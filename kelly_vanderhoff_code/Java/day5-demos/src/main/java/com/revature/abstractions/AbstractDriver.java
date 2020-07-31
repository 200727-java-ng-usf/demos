package com.revature.abstractions;

public class AbstractDriver {

    public static void main(String[] args) {

//		Animal a = new Animal(); // cannot directly instantiate abstract classes

        Cat myCat = new Cat();
        Cat yourCat = new Cat(8, "Sphinx", false);
        Cat hisCat = new Cat(5, "Persian", true);
        Cat herCat = new Cat(7, "Serval", true);

        System.out.println("+---------------------------------------+");

        System.out.println(myCat.getBreed());
        System.out.println(yourCat.hasFur());
        herCat.makeSound();

        System.out.println("+---------------------------------------+");

        /*
            Covariance is when you have a reference of a super type that points to an object
            of a subtype.  This reference will have access to only the states and behaviors of
            the declared reference type.  Although, if any methods of the parent are overridden
            by the subtype, those method will behave as they do for the subtype.
         */

        Animal someAnimal = new Cat(); // covariance!

        // we are directly accessing the member variable here, and since it is perceived
        // as an Animal (see above)
        System.out.println(someAnimal.numberOfLives); // 1
        System.out.println(someAnimal.getNumberOfLives()); // 9

        someAnimal.exists();
        ((Cat) someAnimal).exists();

        Cat someCat = (Cat) someAnimal;
        System.out.println(someCat.getAnimalNumberOfLives()); // 1
        System.out.println(someCat.getNumberOfLives()); // 9

        someCat.exists();

        System.out.println(someCat.thing); // cat toy
    }
}
