package com.TheCollectionFramework;

import java.util.LinkedList;

public class DemoLinkedList {
	    public static void main(String[] args) {

	        LinkedList<Integer> list = new LinkedList<>();

	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        list.add(50);
	        list.add(60);
	        list.add(70);

	        System.out.println("Original List : " + list);


	        System.out.println("\n All Elements:");

	        for (Integer x : list) {
	            System.out.print(x + " ");
	        }

	        
	        System.out.println("\n\nGreater than 40:");
	        list.stream()
	            .filter(x -> x > 40)
	            .forEach(x -> System.out.print(x + " "));


	        System.out.println("\n\nEven Numbers:");
	        list.stream()
	            .filter(x -> x % 2 == 0)
	            .forEach(x -> System.out.print(x + " "));

	        
	        System.out.println("\n\nOdd Numbers:");
	        list.stream()
	            .filter(x -> x % 2 != 0)
	            .forEach(x -> System.out.print(x + " "));


	        System.out.println("\n\nAdd 5:");
	        list.stream()
	            .map(x -> x + 5)
	            .forEach(x -> System.out.print(x + " "));


	        System.out.println("\n\nMaximum:");
	        int max = list.stream()
	                     .max(Integer::compareTo)
	                     .get();
	        System.out.println(max);


	        System.out.println("\nMinimum:");
	        int min = list.stream()
	                     .min(Integer::compareTo)
	                     .get();
	        System.out.println(min);


	        System.out.println("\nCount:");
	        long count = list.stream()
	                         .count();
	        System.out.println(count);


	        System.out.println("\nSearch 40:");
	        boolean found = list.stream()
	                            .anyMatch(x -> x == 40);
	        System.out.println(found);


	        System.out.println("\nSum:");
	        int sum = list.stream()
	                      .mapToInt(x -> x)
	                      .sum();
	        System.out.println(sum);
	    
	    }
	}

