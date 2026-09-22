package com.flatMap;

import java.util.Arrays;
import java.util.List;

public class Demo4 
{
	public static void main(String[] args) 
	{
		List<List<Integer>> list = Arrays.asList(Arrays.asList(10,20),
				Arrays.asList(30,40),
				Arrays.asList(50,60));
		
		int sum = list.stream()
							.flatMap(x->x.stream())
							.mapToInt(x->x)
							.sum();
		System.out.println("SUM = "+sum);
	
		
		
		
	}
}
