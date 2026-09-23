package com.flatMap;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SubjetSET 
{
	public static void main(String[] args) {
		
		 List<List<String>> sub = List.of(
	                List.of("java", "spring"),
	                List.of("java", "hibernate"),
	                List.of("mysql")
	        );

		 Set<String> res = sub.stream()
				 						.flatMap(x->x.stream())
				 						.collect(Collectors.toSet());
		 
		 System.out.println(res);
		
	}
}
