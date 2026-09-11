package com.TheCollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection2 
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,56,34,78,23);
		
		
		System.out.println(list);
		
		var count = list
							.stream()
							.filter(i-> i>5)
							.count();
		System.out.println("\nTotal count Greater than 5 : "+count);
		
		
		}

}
		

