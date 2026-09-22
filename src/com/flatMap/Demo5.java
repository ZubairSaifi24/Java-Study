package com.flatMap;

import java.util.Arrays;
import java.util.List;

public class Demo5 
{
	public static void main(String[] args) 
	{
	
		List<String> str = Arrays.asList("Java is easy", "java is beautifull", "Stream APIs");
		
		str.stream()
				.flatMap(x->Arrays.stream(x.split(" ")))
				.forEach(System.out::println);
		
	}
}