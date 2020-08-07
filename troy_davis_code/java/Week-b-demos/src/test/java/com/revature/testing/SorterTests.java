package com.revature.testing;

import org.junit.*;
import org.junit.internal.runners.statements.ExpectException;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class SorterTests {
    private Sorter sut;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setup(){
        sut = new Sorter();
    }

    @After
    public void tearDown(){
        sut = null;
    }

    @Test
    public void testSolutionWithGivenArray(){
        String msg = "If a randomely sorted array is provided, the impl should return the array sorted";
        int[] testArray = {1,0,5,6,3,2,7,9,8,4};

        int[] expectedResult = {0,1,2,3,4,5,6,7,8,9};
        int[] result = sut.sort(testArray);
        for(int i:result){
            System.out.println(i);
        }
        Assert.assertArrayEquals(msg, expectedResult, sut.sort(testArray));
    }

    @Test
    public void testSolutionWithNullArray(){
        String msg = "If a null array is provided, then impl should return an empty array";
        int[] expectedResult = {};
        int[] actualResult = {};
        assertNotNull(actualResult);
        assertArrayEquals(msg,expectedResult,sut.sort(null));

    }
    //other test cases
    //testSolutionWithReverseArray
    //testSolutionWith PresortedArray
    //empty array
    //
}
