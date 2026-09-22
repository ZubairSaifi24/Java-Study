package com.flatMap;

import java.util.Arrays;
import java.util.List;

public class Demo2 
{
	public static void main(String[] args) 
	{
		
		List<List<String>> name = Arrays.asList(Arrays.asList("Zubair", "Adil"),
				Arrays.asList("Dushyant", "Ahmed"),
				Arrays.asList("RAvi", "Sahil"));
		
		name.stream()
				.flatMap(x->x.stream())
				.forEach(System.out::println);
		
	}
}
