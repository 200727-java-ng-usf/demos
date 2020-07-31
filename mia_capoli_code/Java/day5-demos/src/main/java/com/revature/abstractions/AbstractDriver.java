package com.revature.abstractions;

import com.revature.abstractions.Cat;

public class AbstractDriver {

    public static void main(String[] args) {
    // Animal a = new Animal(): // cannot directly instantiate abstract classes

        Cat myCat = new Cat();
        Cat yourCat = new Cat(8, "Sphinx", false);
        Cat hisCat = new Cat(5, "Persian", true);
        Cat herCat = new Cat(7, "Serval", true);

        Animal someAnimal = new Cat(); // covariance!

        System.out.println(myCat.getBreed());

    }
}
