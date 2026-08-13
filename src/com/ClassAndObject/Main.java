package com.ClassAndObject;
import java.util.Scanner;

public class Main{ 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		serviceClass s = new serviceClass();
		
		System.out.println("\n==========Sum===========\n");
		System.out.print("Enter the number a :");
		int a = sc.nextInt();
		System.out.print("Enter the number b :");
		int b = sc.nextInt();
		int sum = s.Sum(a, b);
		System.out.println("Sum : "+sum);
		
		System.out.println("\n==========Subtract===========\n");
		System.out.print("Enter the number a :");
		a = sc.nextInt();
		System.out.print("Enter the number b :");
		b = sc.nextInt();
		int sub = s.Sum(a, b);
		System.out.println("Sum : "+sub);
		
		System.out.println("\n==========Mulltiply===========\n");
		System.out.print("Enter the number a :");
		a = sc.nextInt();
		System.out.print("Enter the number b :");
		b = sc.nextInt();
		int mul = s.Sum(a, b);
		System.out.println("Multiply  : "+mul);
		
		System.out.println("\n==========Divide===========\n");
		System.out.print("Enter the number a :");
		a = sc.nextInt();
		System.out.print("Enter the number b :");
		b = sc.nextInt();
		int div = s.Sum(a, b);
		System.out.println("Divide : "+div);
		
		System.out.println("\n==========Average===========\n");
		System.out.print("Enter the number a :");
		a = sc.nextInt();
		System.out.print("Enter the number b :");
		b = sc.nextInt();
		System.out.print("Enter the number a :");
		int c = sc.nextInt();
		float avg = s.Average(a, b, c);
		System.out.println("Average : "+avg);
		
		System.out.println("\n==========AreaOfRectangle===========\n");
		System.out.print("Enter the number l :");
		a = sc.nextInt();
		System.out.print("Enter the number b :");
		b = sc.nextInt();
		int AOfR = s.RectangleArea(a, b);
		System.out.println("Area Of Rectangle : "+AOfR);
		
		System.out.println("\n==========AreaOfCircle===========\n");
		System.out.print("Enter the radus :");
		int r = sc.nextInt();
		double cir = s.CircleArea(r);
		System.out.println("Area Of Circle : "+cir);
		
		System.out.println("\n==========Simple Interest===========\n");
		System.out.print("Enter the principle amount :");
		float p = sc.nextInt();
		System.out.print("Enter the rate amount :");
		float r1 = sc.nextInt();
		System.out.println("Enter the time :");
		float t = sc.nextInt();
		float si = s.SipmleInterest(p, r1, t);
		System.out.println("Simple Interest  : "+si);
		
		System.out.println("\n=======Check number +ve or -ve ========\n");
		System.out.print("Enter the number  :");
		a = sc.nextInt();
		int ch = s.CheckNumber(a);
		System.out.println("check number + or -  : "+ch);
		
		System.out.println("\n==========Even or Odd===========\n");
		System.out.print("Enter the number :");
		a = sc.nextInt();
		int ch1 = s.CheckEvenOdd(a);
		System.out.println("Even or odd : "+ch1);
		
		System.out.println("\n==========Find great===========\n");
		System.out.print("Enter the number a :");
		a = sc.nextInt();
		System.out.print("Enter the number b :");
		b = sc.nextInt();
		int find = s.FindGreat(a, b);
		System.out.println("Find number  : "+find);
		
		
		
		
	}			
}