package com.flatMap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SchoolMain 
{
	public static void main(String[] args) 
	{
			List<School> list = Arrays.asList(new School(1,"Zubair", (float) 78.5, new Addres("UP", "Amroha", "244221")),
					new School(2,"Adil", (float) 68.5, new Addres("UP", "Amroha", "244221")),
					new School(3,"Dushyant", (float) 79.5, new Addres("UP", "Ramat", "244221")),
					new School(4,"Rizwan ali", (float) 94.5, new Addres("UP", "noida", "56987")),
					new School(5,"Ahmed", (float) 79.8, new Addres("UP", "lucknow", "34567")));
			
			System.out.println("\n===ALL STUDENT===");
			list.stream()
					.forEach(x->System.out.println(x));
			
			
			System.out.println("\n\n===MAX MARKS===");
			Optional<School> empl =list.stream()
					.max(Comparator.comparing(School::getMarks));
			System.out.println("Max.Salary = "+empl);
			
			System.out.println("\n\n===COUNT NUMBER GREATER THAN 70===");
			long count = list.stream()
									.filter(x->x.getMarks()>70)
									.count();
									System.out.println("marks gt than 70 = "+count);
															
			System.out.println("\n\n=== TOPPER STUDENT===");
			list.stream()
					.filter(x->x.getMarks()>70)
					.forEach(x->System.out.println(x));
			
	}
}
