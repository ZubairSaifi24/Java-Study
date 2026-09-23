package com.flatMap;

import java.util.List;

public class Sum 
{
	public static void main(String[] args) {
		
		List<List<Integer>> num = List.of(
										List.of(1,2),
										List.of(3,4),
										List.of(5,6)
										);
		int sum = num.stream()
								.flatMap(x->x.stream())
								.mapToInt(x->x)
								.sum();
		
		System.out.println(sum);
		
	}
}
