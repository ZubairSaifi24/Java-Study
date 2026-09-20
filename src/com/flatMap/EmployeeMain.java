package com.flatMap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeMain {

	public static void main(String[] args) {
		
	List<Employee> list = Arrays.asList(new Employee(101,"Zubair",new Address("India","UP","Amroha","amroha","244221"),250000),
			new Employee(101,"Adil",new Address("India","UK","Amroha","amroha","244221"),25000),
			new Employee(101,"Rizwan ali",new Address("India","Noida","Amroha","sirsa","244221"),1250000),
			new Employee(101,"Dushyant",new Address("India","Noida","Amroha","ramat","244221"),20000));
	
	list.stream()
			.forEach(System.out::print);
	System.out.println("\n\n======= Maximum salary======== ");
	
	Optional<Employee> empl =list.stream()
			.max(Comparator.comparing(Employee::getSalary));
	System.out.println("Max.Salary = "+empl);
	
	System.out.println("\n\n=====State find =====\n");
	List<Employee> locate = list.stream()
											.filter(e->e.getAddress().getState().equals("Noida"))
											.toList();
	System.out.println(locate);
	
	
	
	}

	
}
