package com.flatMap;

import java.util.List;

public class Names 
{
	public static void main(String[] args) 
	{
	
		List<List<String>> names = List.of(List.of("ALi", "Ahmed"),
									List.of("John", " Zubair"),
									List.of("Dushyant", "Adil"));
		
		List<String> res = names.stream()
												.flatMap(x-> x.stream())
												.toList();
												
								System.out.println(res);
		
	}
}
