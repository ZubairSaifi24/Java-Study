package com.TheCollectionFramework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Collection3 
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(12,23,45,57,67,89,90,56,34,23,13);
		
			//Even ,Odd,Sorted,ReverseOrder,Add+Numbers...
			// by APIs in collection framework.
		
		List<Integer> res = list              // Even Number...
										.stream()
										.filter(i-> i%2==0)
										.collect(Collectors.toList());
		System.out.println("Even numbers = "+res);
		
	
		List<Integer> res2 = list           //Odd Number...
										.stream()
										.filter(i-> i%2 != 0)
										.collect(Collectors.toList());
		System.out.println("\nOdd numbers = "+res2);
		
		
		List<Integer> res3 = list           //Sorted...
										.stream()
										.sorted()
										.collect(Collectors.toList());
		System.out.println("\nSorted  = "+res3);
		
		
		List<Integer> res4 = list           //Sorted...Reverse Order..
										.stream()
										.sorted(Comparator.reverseOrder())
										.collect(Collectors.toList());
		System.out.println("\nSorted Reverse= "+res4);
	
		
		List<Integer> res5 = list           //even number me add
										.stream()
										.filter(i-> i%2==0)
										.map(i ->  i + 10)
										.collect(Collectors.toList());
		System.out.println("\nADD in array = "+res5);

		
		
		
		
	}
}
