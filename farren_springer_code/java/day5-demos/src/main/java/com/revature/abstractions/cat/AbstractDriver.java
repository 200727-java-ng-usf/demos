package com.revature.abstractions.cat;

public class AbstractDriver {

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Cat yourCat = new Cat(8, "Sphinx", false);
        Cat hisCat = new Cat(5, "Persian", true);
        Cat herCat = new Cat(7, "Serval", true);

        Animal someAnimal = new Cat(); // covariance! A type of Polymorphism

    /*
        Covariance is when you have a reference of a super type that points to an object
        of a subtype. This reference will only have access to the states and behaviors of
        the declared reference type. Although, if any methods of the parent are overridden
        by the subtype, those methods will behave as they do for the subtype.
     */
    }




}
