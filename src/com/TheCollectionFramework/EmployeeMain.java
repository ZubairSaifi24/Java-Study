package com.TheCollectionFramework;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1, "zubair", "amroha");
		Employee e2 = new Employee(2, "adil", "amroha-1");
		Employee e3 = new Employee(3, "dushyant", "amroha-2");
		Employee e4 =  new Employee(4, "ahamed", "lucknow");
		
		ArrayList<Employee> employ = new ArrayList<>();
		employ.add(e1);
		employ.add(e2);
		employ.add(e3);
		employ.add(e4);
		
		System.out.println(employ);
		
	}
}
