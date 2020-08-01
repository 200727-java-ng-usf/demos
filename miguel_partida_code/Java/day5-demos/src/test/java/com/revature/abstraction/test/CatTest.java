package com.revature.abstraction.test;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;


import com.revature.abstractions.Cat;
import com.revature.abstractions.Owner;
import org.junit.*;

public class CatTest {


    private Cat cat = new Cat();

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
        System.out.println("After everything");

    }
    @Test

    public void test() {
        System.out.println("testing");
        cat.makeSound();
        assertEquals(9, cat.getNumberOfLives());
    }


@Test
    public void test2(){
        assertEquals("Domestic Short-hair", cat.getBreed());
    }

    @Test
    public void checkOwnerLives() {
        Owner a = new Owner(cat);
            assertEquals(10, a.countLives());

    }


}
