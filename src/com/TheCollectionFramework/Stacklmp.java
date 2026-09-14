package com.TheCollectionFramework;

import java.util.Stack;

public class Stacklmp 
{
	public static void main(String[] args) 
	{
		Stack stack = new Stack<>();
		
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		
		stack.pop();
		System.out.println(stack);
		
		
//		int pop = (int) stack.pop();
//		System.out.println(pop);

		
		System.out.println("\nTop of the element ");
		Object peek = stack.peek();
			System.out.println(peek);
		
	}
}
