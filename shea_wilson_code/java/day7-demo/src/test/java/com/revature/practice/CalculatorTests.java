package com.revature.practice;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTests {

    private Calculator sut; // system under test

    @Before
    public void setUp(){
        sut = new Calculator();
    }

    @After
    public void tearDown(){
        sut =null;
    }

    @Test
    public void multiplyThreeAndFiveIsFifteen(){
        double expectedResult =15.0;
        double actualResult = sut.multiply(3.0,5.0);
        Assert.assertEquals("3 times 5 is 15", expectedResult,actualResult,.001);
    }

    @Test
    public void multiplyZeroAndFifteenIsZero(){
        double expectedResult = 0;
        double actualResult = sut.multiply(0,15);

    }

}
