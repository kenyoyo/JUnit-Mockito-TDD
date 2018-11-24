package com.kazdo.array_equal_test;


import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArrayBuilderTest {
	ArrayBuilder arb;
	
	@Test
	public void testArrayBuilderIntegerArray() {
		arb = new ArrayBuilder<Integer>();
		Integer[] expectedArray = {1, 3, 4, 5};
		arb.build(1, 3, 4, 5);
		
		assertArrayEquals(expectedArray, arb.get());
	}
	
	@Test
	public void testArrayBuilderStringArray() {
		arb = new ArrayBuilder<String>();
		String[] expectedArray = {"A", "B", "C", "D"};
		arb.build("A", "B", "C", "D");

		assertArrayEquals(expectedArray, arb.get());
	}
	
	@Test
	public void testArrayBuilderDecimalArray() {
		arb = new ArrayBuilder<Double>();
		Double[] expectedArray = {10.2, 3.14, 1.999, 77.77};
		arb.build(10.2, 3.14, 1.999, 77.77);
		
		assertArrayEquals(expectedArray, arb.get());
	}
	
	@Test
	public void testArrayBuilderUnexpectedType() {
		ArrayBuilder<String> arb = new ArrayBuilder<String>();
		arb.build(99, 199);
	}
}
