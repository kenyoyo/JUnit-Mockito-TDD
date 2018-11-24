package com.kazdo.multiply_function;

public class Multiply {
	public static int pow(int number, int power) {
		
		int result = 1;
		for(int i=0; i<power; i++) {
			result *= number;
		}
		
		return result;
	}
}
