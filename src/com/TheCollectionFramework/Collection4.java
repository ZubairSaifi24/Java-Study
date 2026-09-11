package com.TheCollectionFramework;

import java.util.LinkedList;

public class Collection4 {
	  public static void main(String[] args) 
	    {
	        LinkedList<Integer> list = new LinkedList<>();
	        list.add(1);
	        list.add(23);
	        list.add(56);
	        list.add(22);
	        list.add(100);
	        list.add(120);
	        list.add(245);
	        System.out.println(list);
	        for (Integer x : list) {
	            System.out.print("[ ");
	            System.out.print(x+" ");
	            System.out.print("]"+",");
	        }

	        System.out.println();
	        list.stream()
	                    .filter(x-> x >5)
	                    .map(x-> x+5)
	                    .forEach(x-> System.out.print(x+" "));
	    }
	}

