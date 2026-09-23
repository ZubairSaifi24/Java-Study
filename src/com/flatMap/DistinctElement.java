package com.flatMap;

import java.util.List;

public class DistinctElement 
{
	public static void main(String[] args) {
	
		List<List<String>> data = List.of(
						List.of("A", "B", "C"),
						List.of("B", "C", "D"),
						List.of("D", "E"));
		
		List<String> res = data.stream()
							.flatMap(x->x.stream())
							.distinct()
							.toList();
		
		System.out.println(res);
		
	}
}
