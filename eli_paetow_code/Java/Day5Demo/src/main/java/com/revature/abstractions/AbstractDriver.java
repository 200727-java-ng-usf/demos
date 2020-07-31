package com.revature.abstractions;


/*
*
* abstract classes cannot be instaantiated. mist have a concrete implementation. can have abstract and
* non abstract. can have no abstract methods
*
*
* */

public class AbstractDriver {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Cat yourCat = new Cat(8, "sphinx", false);
        Cat hisCat = new Cat(8, "persian", true);
        Cat herCat = new Cat(8, "calico", true);

        Animal someAnimal = new Cat();

        System.out.println(myCat.getBreed());


    }
}
