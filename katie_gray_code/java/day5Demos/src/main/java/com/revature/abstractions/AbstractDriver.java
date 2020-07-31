package com.revature.abstractions;

public class AbstractDriver {

    public static void main(String[] args) {
       // Animal a = new Animal(); Cannot instantiate an abstract class

        Cat myCat = new Cat();
        Cat yourCat = new Cat(8, "Sphinx", false);
        Cat hisCat = new Cat(5, "Persion", true);
        Cat herCat = new Cat(7, "Serval", true);
        Animal someAnimal = new Cat(); //covariance;

        System.out.println(myCat.getBreed());

    }

    /*
        Covariance is when you have a reference of a super tpe that points to an object
        of a subtype. this reference will have access to only the states and behaviors of the declared
        reference type. although, if any methods of the parent are overridden by the subtype
        those methods will behave as they do for the subtype
     */
}
