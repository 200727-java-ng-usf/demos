package com.revature.practice;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTests {

    private Calculator sut;

    @Before
    public void setUp(){
        sut = new Calculator();

    }

    @After
    public void tearDown(){
        sut =null;
    }

    @Test
    public void multiplyThreeXFifteen(){
        double expectedResult =15;
        double actualResult = sut.multiply(3,5);
        Assert.assertEquals("3 times 15", expectedResult, actualResult, .0);
    }
    @Test
    public void multiplyfiveAndThree(){
        double expectedResult =15;
        double actualResult = sut.multiply(5, 3);
        Assert.assertEquals("3 times 15", expectedResult, actualResult, .0);
    }
}
