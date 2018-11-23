package com.kazdo.true_false_test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NumberCheckTest {
    
	@Test
	public void testNumberCheckIsNegativeTrue() {
		assertTrue(NumberCheck.isNegative(-5));
	}
	
	@Test
	public void testNumberCheckIsNegativeFalse() {
		assertFalse(NumberCheck.isNegative(10));
	}
	
	@Test
	public void testNumberCheckIsPositiveTrue() {
		assertTrue(NumberCheck.isPositive(32));
	}
	
	@Test
	public void testNumberCheckIsPositiveFalse() {
		assertFalse(NumberCheck.isPositive(-77));
	}
	
	@Test
	public void testNumberCheckIsZeroTrue() {
		assertTrue(NumberCheck.isZero(0));
	}
	
	@Test
	public void testNumberCheckIsZeroFalse() {
		assertFalse(NumberCheck.isZero(49));
	}
}
