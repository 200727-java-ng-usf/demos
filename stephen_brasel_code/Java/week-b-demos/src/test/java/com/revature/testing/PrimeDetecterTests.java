package com.revature.testing;

//import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeDetecterTests {

	private PrimeDetecter sut;

	@Before
	public void setup(){
		sut = new PrimeDetecter();
	}

	@After
	public void tearDown(){
		sut = null;
	}

	@Test
	public void testThatSevenIsPrime(){
		String msg = "Seven is a prime number.";
		boolean result = sut.isPrime(7);
		assertTrue(result);
	}

	// For the math nerds: Look into probabilistic primality tests and implementing
	// Fermat's Little Theorem
	// RSA
	@Test
	public void testThat561IsComposite(){
		String msg = "Seven is a prime number.";
		boolean result = sut.isPrime(561);
		assertFalse(result);
	}

	@Test
	public void testThat1024IsComposite(){
		String msg = "1024 is a prime number.";
		boolean result = sut.isPrime(1024);
		assertFalse(result);
	}

	@Test
	public void testThatMaxIsPrime(){
		String msg = "1024 is a prime number.";
		boolean result = sut.isPrime(Integer.MAX_VALUE);
		assertTrue(result);
	}

}