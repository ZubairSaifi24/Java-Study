package com.flatMap;

import java.util.List;

public class PersonMain 
{
	public static void main(String[] args) {
		
		List<Person> person = List.of(
				new Person("Zubair", List.of("Zubairsaifi2468@gmail.com")),
				new Person("Dushyant", List.of("DushyantSaini@gmail.com")),
				new Person("Adil", List.of("AdilMohd@gmail.com"))
				);
		
		List<String> allEmail = person.stream()
														.flatMap(x-> x.emails.stream())
														.toList();
		System.out.println(allEmail);
		
	}
}
