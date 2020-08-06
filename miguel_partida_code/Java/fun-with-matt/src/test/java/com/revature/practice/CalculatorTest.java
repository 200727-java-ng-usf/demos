package com.revature.practice;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator sut; // SUT = System Under Test

    @Before
    public void setUp() throws Exception {
        sut = new Calculator();
    }

    @After
    public void tearDown(){
        sut = null;
    }

    @Test
    public void multiply3and5is15 (){
        double expected = 15;
        double actual = sut.multiply(3,5);
        Assert.assertEquals("3 * 5 is 15",expected, actual,.001);
    }

    @Test
    public void multiply5and3is15 (){
        double expected = 15;
        double actual = sut.multiply(5,3);
        Assert.assertEquals("5 * 3 is 15",expected, actual,.001);
    }
    @Test
    public void multiply0and15is0 (){
        double expected = 0;
        double actual = sut.multiply(0,15);
        assertEquals("0 * 15 is 15",expected, actual,.001);
    }
    @Test(expected = ArithmeticException.class)
    public void divide0Exception (){
        sut.divide(10.0d,0.0d);
    }

}