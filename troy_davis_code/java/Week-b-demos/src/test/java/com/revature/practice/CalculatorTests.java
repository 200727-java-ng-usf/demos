package com.revature.practice;

import org.junit.*;

public class CalculatorTests {

    private Calculator sut; // SUT = system under test

    @Before
    public void setup(){
        sut = new Calculator();
    }


    @Test
    public void multiplyThreeAndFiveIsFifteen(){
        double expectedResult = 15;
        double actualResult = sut.multiply(3, 5);
        Assert.assertEquals("3 times 5 is 15", expectedResult, actualResult, .001);
    }
    @Test
    public void multiplyFiveAndThree(){
        double expectedResult = 15;
        double actualResult = sut.multiply(5, 3);
        Assert.assertEquals("3 times 5 is 15", expectedResult, actualResult, .001);

    }

    @Test
    public void multiplyZeroAndFifteenIsZero(){
        double expectedResult = 0;
        double actualResult = sut.multiply(0, 15);
        Assert.assertEquals("0 times 15 is zero", expectedResult, actualResult,.001);
    }
    @Test(expected = ArithmeticException.class)
    public void divideByZeroThrowsExeption(){
        double p = sut.divide(10.0d, 0.0d);
        System.out.println(p);
        System.out.println(sut.divide(199467, 0));

    }


    @After
    public void tearDown(){
        sut = null;
    }
}
