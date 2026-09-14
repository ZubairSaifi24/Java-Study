package com.TheCollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(400);
		
		ListIterator<Integer> itr = list.listIterator();
		
		while(itr.hasNext()) {
			Integer x = itr.next();
			System.out.println("  "+x);
			//itr.remove();
		}
		System.out.println();
		
		while(itr.hasPrevious()) {
			System.out.println(" "+itr.previous());
		}
		
		System.out.println();
		System.out.println(list);
		
		
		
	}
}






