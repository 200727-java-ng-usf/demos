package com.revature.abstractions;

public class AbstractDriver {

    public static void main(String[] args){

        Cat kitty = new Cat();
        Cat yourCat = new Cat( 8,"Sphinx",false);
        Cat hisCat = new Cat(5,"Persian",true);
        Cat herCat = new Cat(7, "Serval",true);



        System.out.println(kitty.getBreed());
        System.out.println(herCat.getNumberOfLives());



        System.out.println("------------------------------------------------");

        Animal someAnimal = new Cat();//covariance!

        System.out.println(someAnimal.numberOfLives); // 1




    }
}
