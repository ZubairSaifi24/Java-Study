package com.TheCollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionImpl 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) 
		{
			System.out.print("Enter the number : ");
			int n = sc.nextInt();
			list.add(n);
		}
		System.out.println(list);
		System.out.println("\n");
		
		for(int i=0; i<list.size(); i++) 
		{
			if(list.get(i)%2==0) 
			{
				System.out.print(list.get(i)+" ");
			}
		}
		
	}
}
