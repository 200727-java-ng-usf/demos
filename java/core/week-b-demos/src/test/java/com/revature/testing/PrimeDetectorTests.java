package com.revature.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeDetectorTests {

    private PrimeDetector sut;

    @Before
    public void setup() {
        sut = new PrimeDetector();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void testThatSevenIsPrime() {
        boolean result = sut.isPrime(7);
        assertTrue(result);
    }

    @Test
    public void testThat1024IsComposite() {
        boolean result = sut.isPrime(1024);
        assertFalse(result);
    }

    // For the math nerds: Look into probablistic primality test and implementing
    // Fermat's Little Theorem - doesn't detect Carmichael numbers
    @Test
    public void testThat561IsComposite() {
        boolean result = sut.isPrime(561);
        assertFalse(result);
    }

    @Test
    public void testThatMaxIntegerIsPrime() {
        boolean result = sut.isPrime(Integer.MAX_VALUE);
        assertTrue(result);
    }

}
