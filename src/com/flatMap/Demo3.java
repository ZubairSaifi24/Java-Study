package com.flatMap;

import java.util.Arrays;
import java.util.List;

public class Demo3 
{
	public static void main(String[] args) 
	{
	
		 List<List<Integer>> list = Arrays.asList(
	                Arrays.asList(1, 2, 3),
	                Arrays.asList(4, 5, 6),
	                Arrays.asList(7, 8, 9)
	        );
		 
		 List<Integer> result = list.stream()
				 			.flatMap(x->x.stream())
				 			.toList();
		 System.out.println(result);
		
	}
}
