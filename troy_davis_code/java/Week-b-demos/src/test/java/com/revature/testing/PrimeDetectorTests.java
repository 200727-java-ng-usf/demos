package com.revature.testing;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class PrimeDetectorTests {
    private PrimeDetector sut;

    @Before
    public void setup(){
        sut = new PrimeDetector();
    }

    @After
    public void tearDown(){
        sut = null;
    }

    @Test
    public void TestThatSevenIsPrime(){
        boolean result = sut.isPrime(7);
        Assert.assertTrue(result);
    }

    @Test
    public void testThat1024IsComposite(){
        boolean result = sut.isPrime(1024);
        Assert.assertFalse(result);
    }

    //probabalistic primality test; implements
    //Fermat's little Theorem
    @Test
    public void testThat561IsComposite(){
        //carmichael number - if put through prob. primality test
        boolean result = sut.isPrime(561);
        Assert.assertTrue(result);
    }
    @Test
    public void testMAXiSpRIME(){
        boolean result = sut.isPrime(Integer.MAX_VALUE);
        assertTrue(result);
    }
}

