package SET;

import java.util.HashMap;

public class EmployeeMain {

	    public static void main(String[] args) {

	        HashMap<Integer, Employee> map = new HashMap<>();

	        Employee e1 = new Employee(101, "Zubair", "amroha", 23000);
	        Employee e2 = new Employee(102, "Adil", "amroha-jp", 23000);
	        Employee e3 = new Employee(103, "dushyant", "amroha ", 21000);
	        Employee e4 = new Employee(104, "rizwan ali", "Delhi", 250000);

	        map.put(e1.getId(), e1);
	        map.put(e2.getId(), e2);
	        map.put(e3.getId(), e3);
	        map.put(e4.getId(), e4);

	        System.out.println("All Employees:");
	        System.out.println(map);

	        System.out.println("\n\nEmployee  ID :");
	        System.out.println(map.get(101));


	        System.out.println("\nUsing Stream:");
	        map.entrySet()
	           .stream()
	           .forEach(entry -> System.out.println(entry.getValue()));
	        
	        map.entrySet()
	           .stream()
	           .filter(entry -> entry.getValue().getSalary() > 50000)
	           .forEach(entry -> System.out.println(entry.getValue()));


	    }
	}

