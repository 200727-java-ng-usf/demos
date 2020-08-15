package com.revature.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

import java.rmi.server.ExportException;

public class SorterTests {

    private Sorter sut;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setup() {
        sut = new Sorter();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void testSolutionWithGivenArray() {
        String msg = "if a randomly sorted array is provided, the implementation should return the array sorted.";
        int[] testArray = {1,0,5,6,3,2,3,7,9,8,4};
        int[] expectedResult = {0,1,2,3,3,4,5,6,7,8,9};
        assertArrayEquals(msg, expectedResult, sut.sort(testArray));
    }



    @Test
    public void testSolutionWithNullArray() {
        String msg = "If a null array is provided, them impl should return an empty array.";
        int[] expectedResult = {};
        int[] actualResult = sut.sort(null);
        assertNotNull(actualResult);
        assertArrayEquals(msg, expectedResult, actualResult);
    }

    // other test examples:
    // testSolutionWithReversedArray
    // testSolutionWithPresortedArray
    // testSolutionWithEmptyArray
}
