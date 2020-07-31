package com.revature;

import static org.junit.Assert.assertEquals;

import com.revature.abstractions.Crocodilian;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CrocodilianTest {
    
    private Crocodilian croc = new Crocodilian();
    
    @Before
    public void setup(){
        System.out.println("before");
    }
    
    @After
    public void after(){
        System.out.println("after");
    }
    
    @BeforeClass
    public static void beforeAll(){
        System.out.println("before everything");
    }
    
    @AfterClass
    public static void afterAll(){
        System.out.println("after everything");
    }
    
    @Test
    public void test(){
        int original = croc.getNumberOfLives();
        croc.makeSound();
        assertEquals(croc.getNumberOfLives(), original + 1);
    }

    public void test2(){
        assertEquals("Alligator", croc.getSpecies());
    }
}