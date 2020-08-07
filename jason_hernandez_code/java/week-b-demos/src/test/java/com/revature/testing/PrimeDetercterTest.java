package com.revature.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeDetercterTest {

    private PrimeDetecter sut;

    @Before
    public void setup() {
        sut = new PrimeDetecter();
    }
    
    @After
    public void teardown() {
        sut = null;
    }

    @Test
    public void sevenIsPrime() {
        boolean result = sut.isPrime(7);
        assertTrue(result);
    }

    @Test
    public void test1024NotPrime() {
        boolean result = sut.isPrime(1024);
        assertFalse(result);
    }

    @Test
    public void test561NotPrime() {  // Carmichael number - not prime, but detecter will say it is
        boolean result = sut.isPrime(7);
        assertFalse(result);
    }

    @Test
    public void maxInteger() {
        boolean result = sut.isPrime(Integer.MAX_VALUE);
        assertTrue(result);
    }
}
