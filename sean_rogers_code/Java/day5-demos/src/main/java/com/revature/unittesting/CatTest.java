package com.revature.unittesting;

import com.revature.abstractions.Cat;

public class CatTest {
    private Cat cat = new Cat();

    //@Test
    public void test() {
        cat.makeSound();
        System.out.println(cat.getNumberOfLives());
    }
}
