package com.TheCollectionFramework;

import java.util.ArrayList;
import java.util.Comparator;

public class Iterator2 
{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(230);
		list.add(23);
		list.add(-12);
		list.add(45);
		list.add(20);
		list.add(30);
		list.add(289);
		
		System.out.println(list);
		
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2.compareTo(o1);
			}
		});
		
		System.out.println();
		System.out.println(list);
		
		
		
		
	}
}












