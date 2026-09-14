package com.TheCollectionFramework;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EmployeeMain3 
{
	public static void main(String[] args) 
	{
		Employee3 e1 = new Employee3(1, "zubair", "amroha");
		Employee3 e2 = new Employee3(2, "adil", "amroha-1");
		Employee3 e3 = new Employee3(3, "dushyant", "amroha-2");
		Employee3 e4 =  new Employee3(4, "ahamed", "lucknow");
		
		ArrayList<Employee3> employ = new ArrayList<>();
		employ.add(e1);
		employ.add(e2);
		employ.add(e3);
		employ.add(e4);
		
		System.out.println(employ);
		
	}
}
