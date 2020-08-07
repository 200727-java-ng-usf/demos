package com.revature.practice;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    private  Calculator sut;
    @Before
    public void setUp() {
        sut = new Calculator();
    }
    @After
    public  void tearDown(){
        sut = null;
    }

    @Test
    public void add() {
    }

    @Test
    public void subtract() {
    }

    @Test
    public void multiply() {
        double expectedResult = 15;
        double actualResult = sut.multiply(3,5);
        Assert.assertEquals("3 times 5 is 15",expectedResult,actualResult,.001);
    }
    
}