package com.Interface;

public class InterfaceEg implements A{
		
	@Override
	public void Test() {
		System.out.println("Test()");
		
	}

	@Override
	public int call() {
		System.out.println("Called()");
		return 100;
	}

	@Override
	public void food(int x, int y) {
		System.out.println("Food-> "+(x+y));
		
	}

	
}
