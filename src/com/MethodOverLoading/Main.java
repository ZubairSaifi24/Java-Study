package com.MethodOverLoading;

public class Main {

	public static void main(String[] args) {
		
		Math m = new Math();
		m.sum();
		m.sum(15, 50);
		m.sum(45, 40, 70);
		m.sum(45.1f, 70.6f);
	}
	
}
