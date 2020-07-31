package com.revature.abstractions;

public class AbstractDriver {
    public static void main(String[] args) {

//        Animal a;
//        a = new Animal(); // cannot directly instantiate anstract classes

        Cat myCat = new Cat();
        Cat yourCat = new Cat(9, "Sphinx", false);
        Cat hisCat = new Cat(5, "Persian", true);
        Cat herCat = new Cat(7, "Serval", true);

        Animal someAnimal = new Cat(); // covariance!

        System.out.println(myCat.getBreed());


    }

}
