package com.ClassAndObject;

public class serviceClass {

		public int Sum(int a, int b) {
			return a+b;
		}
		
		//Subtraction
		public int Sub(int a, int b) {
			return a-b;
		}
		
		public int Mul(int a, int b) {
			return a*b;
		}
		
		public int Div(int a, int b) {
			return a/b;
		}
		
		//Area  of Rectangle
		public int RectangleArea(int l, int b) {
			return l*b;
		}
		
		//Find Area Of Circle
		public double CircleArea(int r) {
			return  (2*3.14*r);
		}
		
		//Simple Interest Calculate
		public float SipmleInterest(float p, float r,float t) {
			return  ((p*r*t)/100);
		}
		
		//Average 
		public float Average(int a, int b,int c) {
			return (a+b+c)/3;
		}
		
		//Check positive or negative
		public int CheckNumber(int n) {
			if(n<0) {
				System.out.print("Number is Negative");
			}
			else {
				System.out.print("Number is Positive");
			}
			return n;
		}
			
		//Check even or odd
			public int CheckEvenOdd(int n) {
				if(n%2==0) {
				System.out.print("Number is Even");	
				}
				else {
					System.out.print("Number is Odd");
				}
				return n;
			}
			
			//Find greater
			public int FindGreat(int a,int b) {
				if(a<b) {
					System.out.print("\na is greater");
				}
				else if(b>a) {
					System.out.print("b is greater");
				}
				else {
					System.out.print("both are equal");
				}
				return FindGreat(a, b);
				}

		
	}
