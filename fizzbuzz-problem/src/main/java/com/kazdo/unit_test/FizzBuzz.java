package com.kazdo.unit_test;

public class FizzBuzz {
	public static String process(int number) {
		
		if(number % 15 == 0)
			return "FizzBuzz";
		else if(number % 3 == 0)
			return "Fizz";
		else if(number % 5 == 0)
			return "Buzz";
		else
			return String.valueOf(number);
		
	}
	
	public static boolean isFizz(int number) {
		if(number % 3 == 0)
			return true;
		else 
			return false;
	}
	
	public static boolean isBuzz(int number) {
		if(number % 5 == 0)
			return true;
		else 
			return false;
	}
	
	public static boolean isFizzBuzz(int number) {
		if(number % 15 == 0)
			return true;
		else 
			return false;
	}
}
