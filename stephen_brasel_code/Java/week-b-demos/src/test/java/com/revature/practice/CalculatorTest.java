package com.revature.practice;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest extends TestCase {

	private Calculator sut; // SUT = System Under Test

	@Before
	public void setUp(){
		sut = new Calculator();
	}

	@After
	public void tearDown(){
		sut = null;
	}

	@Ignore
	public void testAdd() {
		fail();

	}

	@Ignore
	public void testSubtract() {
		fail();
	}

	@Test
	public void testMultiplyThreeAndFiveIsFifteen() {
		assertEquals("3 times 5 = 15", 15.0D, sut.multiply(3.0D, 5.0D), 0.001D);
	}

	@Test
	public void testMultiplyFiveAndThreeIsFifteen() {
		assertEquals("5 times 3 = 15", 15.0D, sut.multiply(5.0D, 3.0D), 0.001D);
	}

	@Test
	public void testMultiplyByZeroIsZero() {
		double expected = 0.0D;
		double actual = sut.multiply(5.0D, 0.0D);
		assertEquals("5 times 0 = 0", expected, actual, 0.001D);
	}

	@Test(expected = ArithmeticException.class)
	public void testDivideByZeroThrowqsException(){
		double res =sut.divide(10.0d, 0.0d);
		System.out.println(res);
	}

	@Ignore
	public void testDivide() {
		fail();
	}
}