package com.flatMap;

import java.util.Arrays;
import java.util.List;

public class Demo 
{
	public static void main(String[] args) 
	{
		List<List<Integer>> list = Arrays.asList(Arrays.asList(1,2,3,4),
				Arrays.asList(5,6,7,8),Arrays.asList(9,10,11,12));
		
		list.stream()
				.flatMap(x->x.stream())
				.filter(x->x%2==0)
				.forEach(System.out::println);
	}
}
