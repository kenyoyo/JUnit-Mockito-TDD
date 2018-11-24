package com.kazdo.multiply_function;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestMultiply {

	private String input;
	private String expectedOutput;

	public TestMultiply(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<String[]> testCondition() {
		String expectedOutputs[][] = { 
				{ "5 2", "25" }, 
				{ "10 5", "100000" }, 
				{ "9 3", "729" } };

		return Arrays.asList(expectedOutputs);
	}

	@Test
	public void testMultiplyPowFunction() {
		String splitInput[] = input.split(" ");
		int number = Integer.parseInt(splitInput[0]);
		int power = Integer.parseInt(splitInput[1]);
		int castExpectedOutput = Integer.parseInt(expectedOutput);

		assertEquals(castExpectedOutput, Multiply.pow(number, power));
	}
}
