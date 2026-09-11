package com.TheCollectionFramework;

import java.util.Arrays;
import java.util.List;

public class StreamReduce 
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		int m = list.stream()
						.reduce(1, (a,b)-> a*b);
		System.out.println("SUM : "+m);
	
		int s = list.stream()
					.reduce(0, (a,b)-> a+b);
		System.out.println("SUM : "+s);
	
	}
}
