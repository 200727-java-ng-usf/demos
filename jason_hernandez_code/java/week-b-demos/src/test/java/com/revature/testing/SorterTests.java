package com.revature.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import static org.junit.Assert.*;

public class SorterTests {

    private Sorting sut;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setUp() {
        sut = new Sorting();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void givenArray() {
        String msg = "If  randomly sorted array is povided, should return sorted in order";
        int[] testArray = {1,0, 5, 6,3,2,3,7,9,8,4};
        int[] expectedArray = {0,1,2,3,3,4,5,6,7,8,9};
        assertArrayEquals(msg, expectedArray, sut.sort(testArray));
    }

    @Test
    public void nullArray() {
        String msg2 = "If a null array is passed, should return empty array";
        int [] expectedResult = {};
        int[] actualResult = sut.sort(null);
        assertNotNull(actualResult);
        assertArrayEquals(msg2, expectedResult, actualResult);
    }
}
