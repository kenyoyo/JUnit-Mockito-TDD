package com.kazdo.array_equal_test;

public class ArrayBuilder<T> 
{
	private T[] array;
	
	public void build(T ...a) {
		array = a.clone();
	}
	
	public T[] get() {
		return array;
	}
}
