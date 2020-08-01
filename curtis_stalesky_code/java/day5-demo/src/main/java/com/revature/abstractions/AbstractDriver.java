package com.revature.abstractions;

public class AbstractDriver {

    public static void main(String[] args){
        // Animal a = new Animal(); // cannot directly instantiate abstract classes

        Cat myCat = new Cat();
        Cat yourCat = new Cat(8, "Sphinx", false);
        Cat hisCat = new Cat(5, "Persian", true);
        Cat herCat = new Cat(7, "Serval", true);

        System.out.println("+-------------------------------------------------+");


        System.out.println("+-------------------------------------------------+");

        System.out.println(myCat.getNumberOfLives());
        System.out.println(yourCat.isHasFur());
        System.out.println(hisCat.isHasFur());
        herCat.makeSound();

        System.out.println("+-------------------------------------------------+");

        /*
            Covariance is when you have a reference of a super type that points to an object of a subtype.
            This reference will have access to only the states
         */
        Animal someAnimal = new Cat(); // covariance!

        System.out.println(someAnimal.numberOfLives); // 1
        System.out.println(someAnimal.getNumberOfLives()); // 9

        someAnimal.exist();

        Cat someCat = (Cat) someAnimal;

        ((Cat) someAnimal).exist();

        System.out.println(someCat.getAnimalOfLives()); // 1
        System.out.println(someCat.getNumberOfLives()); // 9

        someCat.exist();

        System.out.println(someAnimal.value);

        System.out.println("+-------------------------------------------------+");

        someCat.wag();


    }
}
