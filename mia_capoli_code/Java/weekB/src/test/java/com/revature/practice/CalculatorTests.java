package com.revature.practice;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTests {
    private Calculator sut; //system under test

    @Before
    public void setUp() {
        sut = new Calculator();
    }

    @After
    public void teardown() {
        sut = null;
    }

    @Test
    public void multiplyThreeAndFiveIsFifteen() {
        double expectedResult = 15;
        double actualResult = sut.multiply(3, 5);
        Assert.assertEquals("3 times 5 is 15", expectedResult, actualResult, 0.001);
    }

    @Test
    public void multiplyFiveAndThreeIsFifteen() {
        double expectedResult = 15;
        double actualResult = sut.multiply(5, 3);
        Assert.assertEquals("5 times 3 is 15", expectedResult, actualResult, 0.001);
    }

    @Test
    public void multiply115And0Equals0() {
        double expectedResult = 0;
        double actualResult = sut.multiply(0, 15);
        Assert.assertEquals("0 times 15 is 0", expectedResult, actualResult, 0.001);
    }

    @Test
    public void addThreeAndThreeIsSix() {
        double expectedResult = 6;
        double actualResult = sut.add(3, 3);
        Assert.assertEquals("3 plus 3 is 6", 3, 3, .001);
    }

    @Test(expected = ArithmeticException.class)
    public void divideBy0ThrowsException() {
        sut.divide(10, 0);
    }
}
