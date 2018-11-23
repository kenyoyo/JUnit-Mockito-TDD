package com.kazdo.unit_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
    
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
