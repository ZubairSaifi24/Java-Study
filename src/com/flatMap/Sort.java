package com.flatMap;

import java.util.List;

public class Sort
{
	public static void main(String[] args) 
	{
	
		List<List<Integer>> num = List.of(
							List.of(5,2),
							List.of(9,1),
							List.of(8,4)
				);
		
		List<Integer> res = num.stream()
									.flatMap(x->x.stream())
									.sorted()
									.toList();
		System.out.println(res);
		
	}
}
