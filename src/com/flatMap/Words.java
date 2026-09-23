package com.flatMap;

import java.util.Arrays;
import java.util.List;

public class Words 
{
	public static void main(String[] args) {
		
		List<String> sentences = List.of(
			    "Java is powerful",
			    "Streams are useful"
			);
		
		List<String> res = sentences.stream()
										.flatMap(sen -> Arrays.stream(sen.split(" ")))
										.toList();
		System.out.println(res);
										
										
		
	}

}
