package com.flatMap;

import java.util.List;

public class Characters
{
	public static void main(String[] args) 
	{
	
		List<String> words = List.of("Java", "Code");
		
		List<Character> result = words.stream()
														.flatMap(x->x.chars().mapToObj( c -> (char) c))
														.toList();
		System.out.println(result);
					
	}
}
