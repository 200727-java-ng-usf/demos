package com.revature.abstractionstest;

import com.revature.abstractions.Cat;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CatTest {

    private Cat testCat = new Cat();

    @Test
    public void test() {
        testCat.makeSound();
        System.out.println(testCat.getNumberOfLives());
        assertEquals(9,testCat.getNumberOfLives());

    }


}
