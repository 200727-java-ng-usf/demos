package com.revature.abstractions;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    Cat myCat = new Cat();

    @Test
    public void makeSound() {
        myCat.makeSound();
    }

    @Test
    public void getNumberOfLives() {
        myCat.getNumberOfLives();
        System.out.println(myCat.getNumberOfLives());
    }

}