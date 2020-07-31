package com.revature.abstractions;

import com.revature.abstractions.Cat;
import org.junit.*;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class CatTest {
    private Cat cat = new Cat();
    private Cat mockedCat = Mockito.mock(Cat.class);

    @Before
    public void setup() {
        System.out.println("before");
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @BeforeClass
    public void beforeAll() {
        System.out.println("before everything");
    }

    @AfterClass
    public void afterAll() {
        System.out.println("after everything");
    }

    @Test
    public void test() {
        cat.makeSound();
        assertEquals(8, cat.getNumberOfLives());
    }
    public void test2() {
        assertEquals("Domestic Shorthair", cat.getBreed());
    }
    public void checkOwnerLives() {
        Mockito.when(mockedCat.getNumberOfLives()).thenReturn(5);
        Owner a = new Owner(cat);
    }
}
