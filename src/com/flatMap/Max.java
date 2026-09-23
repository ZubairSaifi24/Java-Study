package com.flatMap;

import java.util.List;

public class Max
{
	public static void main(String[] args) 
	{
	
		List<List<Integer>> num = List.of(
							List.of(5,2),
							List.of(9,1),
							List.of(8,4)
				);
		
		int max = num.stream()
									.flatMap(x->x.stream())
									.max(Integer::compareTo)
									.get();
		
		System.out.println(max);
		
	}
}