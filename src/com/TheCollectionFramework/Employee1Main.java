package com.TheCollectionFramework;

import java.util.ArrayList;

public class Employee1Main 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee1> employee = new ArrayList<>();
		employee.add(new Employee1(001, "Zubair", "amroha","IFTM University"));
		employee.add(new Employee1(002, "Adil", "amroha-jp","IFTM University"));
		employee.add(new Employee1(003, "Dushyant", "Ramat","IFTM University"));
		
		System.out.println(employee);
	}
}
