package com.MethodOverLoading;

public class Math {

	public void sum() {
		System.out.println("Hello Method OverLoading");
	}
	
	public void sum(int a, int b) {
		System.out.println("Sum : "+(a+b));
	}
	
	public void sum(int a, int b, int c) {
		System.out.println("Sum2 : "+(a+b+c));
	}
	
	public void sum(float a, float b) {
		System.out.println("Sum float : "+(a+b));
	}
	
}
