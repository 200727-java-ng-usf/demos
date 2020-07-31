package com.revature.abstractions;

public class AbstractDiver {
    public static void main(String[] args) {

        Cat myCat = new Cat();
        Cat yourCat = new Cat(9, "Siamese", true);
        Cat hisCat = new Cat(8, "Sphinx", false);

        System.out.println("+---------------------+");
        System.out.println(myCat.getBreed());
        System.out.println("+---------------------+");

        Animal someAnimal = new Cat(); // Covariance
        System.out.println(someAnimal.numberOfLives); // 1 - it uses Animal state
        System.out.println(someAnimal.getNumberOfLives()); // 9 - it gets the Cat state by the override and this
    }
}
