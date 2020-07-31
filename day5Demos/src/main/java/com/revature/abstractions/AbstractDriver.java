package com.revature.abstractions;

public class AbstractDriver {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Cat yourCat = new Cat(8,"Bob",false);
        Cat newCat = new Cat(7,"Serval",true);

        Animal someAnimal = new Cat();
        System.out.println(someAnimal.numberOfLives);//1
        System.out.println(someAnimal.getNumberOfLives());

        Cat someCat = (Cat)someAnimal;

        someAnimal.exit();
        someCat.exit();

        System.out.println("--------------------After override exit()-------------");

        someAnimal.exit();
        someCat.exit();


    }
}
