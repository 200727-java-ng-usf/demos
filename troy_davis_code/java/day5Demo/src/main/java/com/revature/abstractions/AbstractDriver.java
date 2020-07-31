package com.revature.abstractions;

public class AbstractDriver {

    public static void main(String[] args) {
        Cat c = new Cat();
        Cat yc = new Cat(8, "Spinx", false);
        Cat hisCat = new Cat(5, "collie", true);

        System.out.println("++---------------++");
        Animal someAnimal = new Cat(); //covariance

        System.out.println("++-----------------++");
        System.out.println(c);
        System.out.println(yc);
        System.out.println(hisCat);
        System.out.println(c.getNumberOfLives());
        System.out.println("++-----------------++");
        yc.makeSound();
        System.out.println("++-----------------++");
        /*
            covariance is when you have a ref of a ssuper type that points to an object of a subtype. the ref will
            have access to only the states and behaviors of the declared ref type. although, if any methods of thte type
            are overridden by subtype, those methods will behave as they do for that subtype
         */
        Animal someAnimal2 = new Cat(); //covariance!

        System.out.println(someAnimal2.numberOfLives); //1
        System.out.println(someAnimal2.getNumberOfLives());


        Cat someCat = (Cat) someAnimal2;

        ((Cat) someAnimal).HasFur();
        System.out.println("++-----------------++");
        System.out.println(someAnimal.value);
        System.out.println(someCat.value);
        someCat.getAnimalNumberOfLives();
    }
}
