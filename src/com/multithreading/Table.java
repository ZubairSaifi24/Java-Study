package com.multithreading;
import java.util.Scanner;

public class Table{
public static int Table(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to write table : ");
		n = sc.nextInt();
		for(int i =1; i<=10; i++) {
			System.out.println(n+" * "+ i+" = "+(n*i));
		}
		return n;	
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(
				()->{
					int n = 0;
					Table(n);
				});
		t1.start();
		
	}
}

