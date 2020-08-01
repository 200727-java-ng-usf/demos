package com.revature.assignments;

import org.junit.*;

/*
    Q6. Write a program to determine if an integer is even without using the modulus operator (%)
*/
public class Question6Test {
    Question6 q = new Question6();
    @Before
    public void beforeAll(){

    }

    @Test
    public void notNull(){
        //does the method return anything at all?
        Assert.assertNotNull("the method returned null", q.findIfEven(8));
    }
    @Test
    public void testEven(){
        //test a random even number to see if it will return true, that it is even
        Assert.assertTrue("The method failed to identify if 8 is odd",q.findIfEven(10));
    }
    @Test
    public void testOdd(){
        //test a random odd number to see if it will return true, that it is odd
        Assert.assertFalse("The method failed to identify if 7 is odd",q.findIfEven(7));
    }
}
