package com.Static;

public class Main {
	
	static {
		System.out.println("\nHello guys ");
	}
	
	public static void main(String[] args) {	
	
		System.out.println("Student Name : "+Student.name);
		System.out.println("Student RollNo : "+Student.rollNo);
		System.out.println("College : "+Student.college);
		
		Student2.show();
		}
	}
