package com.kazdo.unit_test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FizzBuzzTest {
    public static int testNumber;
	
	
	@BeforeClass
	public static void startTesting() {
		System.out.println("Run FizzBuzz Testing...");
	}
	
	@Before
	public void startTestCase() {
		testNumber++;
		System.out.println("Start test case: " + testNumber);
	}
	
	@After
	public void finishTestCase() {
		System.out.println("Finish test case: " + testNumber);
	}
	
	@AfterClass
	public static void finishTesting() {
		System.out.println("Finish FizzBuzz Testing.");
	}
	
	@Test
	public void testFizzBuzzByTwo() {
		assertEquals("2", FizzBuzz.process(2));
	}
	
	@Test
	public void testFizzBuzzBySeven() {
		assertEquals("7", FizzBuzz.process(7));
	}

	@Test
    public void testFizzBuzzByThree() {
    	assertEquals("Fizz", FizzBuzz.process(3));
    }
	
	@Test
	public void testFizzBuzzByFive() {
		assertEquals("Buzz", FizzBuzz.process(5));
	}
	
	@Test
	public void testFizzBuzzbyFifthTeen() {
		assertEquals("FizzBuzz", FizzBuzz.process(15));
	}
}
