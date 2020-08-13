package com.revature.practice;

import org.junit.*;

import java.io.FileNotFoundException;

/*
 * A class declaration that includes test methods is cvalled a "test suite"
 */
public class DummyTests {

	/*
		@RunWith [class-level]
		@Before (Junit 4) / @BeforeEach (Junit 5) [instance method-level]
		@After (Junit 4) / @AfterEach (Junit 5) [instance method-level]
		@BeforeClass (Junit 4) / @BeforeEach (Junit 5) [static method-level]
		@AfterClass (Junit 4) / @BeforeEach (Junit 5) [static method-level]
		@Test [instance method-level]
		@Ignore [instance method-level]
		@Rule [instance field-level]
	 */

	@BeforeClass // this method MUST be declared as static
	public static void runsBeforeClassTests() {
		System.out.println("This will run once before any of the test suite's test cases.");
	}

	@AfterClass // this method MUST be declared as static
	public static void runsAfterClassTests() {
		System.out.println("This will run once after all of this test suite's test cases.");
	}

	@Before // acts as a setup method for each case
	public void beforeEachTest() {
		System.out.println("This will run once before each test case within the test suite.");
	}

	@After
	public void afterEachTest() {
		System.out.println("This will run once after each test case within the test suite");
	}

	@Test
	public void testMyMethod() {
		System.out.println("This is a basic test method; this one doesn't actually test anything though");
	}

	@Test
	public void testMyMethodAnotherWay() {
		System.out.println("This is another basic test method; this one doesn't actually test anything though");
	}

	@Test(expected = FileNotFoundException.class)
	public void testMyOtherMethod() throws FileNotFoundException{
		System.out.println("This is yet another basic test method; this one doesn't actually test anything though");
		throw new FileNotFoundException();
	}

	@Ignore("test not finished, will come back to it")
	public void ignoreThisTest() {
		System.out.println("This test may not be finished, so we will ignore it for now.");
	}
}
