package com.reavature.abstractionans.test;

import  com.revature.abstractions.Cat;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class CatTest {

    private Cat cat = new Cat();
    //creates a mock object for testing
    private Cat mockedCat = Mockito.mock(Cat.class);

    @Test
    public void test(){
        cat.makeSound();
        assertEquals(8, cat.getAnimalNumberOfLives());
        Mockito.when(mockedCat.getNumberOfLives()).thenReturn(5);

    }
}
