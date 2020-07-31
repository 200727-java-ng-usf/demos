package com.revature;

import static org.junit.Assert.assertEquals;

import com.revature.abstractions.Crocodilian;

import org.junit.Test;

public class CrocodilianTest {
    
    private Crocodilian croc = new Crocodilian();

    @Test
    public void Test(){
        int original = croc.getNumberOfLives();
        croc.makeSound();
        assertEquals(croc.getNumberOfLives(), original + 1);
    }

}