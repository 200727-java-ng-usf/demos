package com.revature.testing;


import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

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
		String msg = "If a randdomly sorted array is provided, the impl should return the array sorted";
		int[] testArray = 		{1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
		int[] expectedResult = 	{0, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9};
		assertArrayEquals(msg, expectedResult, sut.sort(testArray));
	}

	// other test case examples:
	// testSolutionWithGivenArray
	// testSolutionsWithReversedArray / worst case scenario
	// testSolutionsWithPresortedArray / best case scenario
	// testSolutionWithEmptyArray
	// testSolutionWithNull
	// Parameterized junit tests

	@Test
	public void testSolutionWithANullArray(){
		String msg = "If a null array is provided, the impl should return an empty array.";
		int[] expectedResult = {};
		assertArrayEquals(msg, expectedResult, sut.sort(null));
	}

}
