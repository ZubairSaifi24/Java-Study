package com.TheCollectionFramework;

import java.util.ArrayList;

public class Collection 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList<>();
		
		list.add(100);
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(500);
		list.add(600);
		list.add(null);
		list.add("Zubair");
		list.add('z');
		
		System.out.println(list);
	}
	
}
