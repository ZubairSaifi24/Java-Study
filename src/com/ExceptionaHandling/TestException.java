package com.ExceptionaHandling;

import java.time.Instant;

public class TestException {

	public static void main(String[] args) {
		int a = 10;
		int b =0;
		int c;
		try {
			c = a/b;
			System.out.println("div : "+c);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(System.currentTimeMillis());
		System.out.println(Instant.now());
		System.out.println("\n====================================");
		System.out.println("======Welcome to my program=======");
		System.out.println("====================================");
		}
	}
	
