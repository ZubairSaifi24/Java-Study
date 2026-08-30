package com.Interface;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Math m = ()->{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number a :");
			int a = sc.nextInt();
			System.out.println("Enter the number b : ");
			int b = sc.nextInt();
			int c = a+b;
			System.out.println("Sum :  "+c);
		};
		m.sum();
		
	
	}
	
}
