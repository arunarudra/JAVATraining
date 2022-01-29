package com.oopsConcepts;

public class OverloadingExample {
	
	public void sum(int a, int b) {
		int result = a+b;
		System.out.println("result =" +result);
	}
	
	public void sum(int a, int b, int c) {
		int result = a+b+c;
		System.out.println("result = " +result);
	}

}
