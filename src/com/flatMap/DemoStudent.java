package com.flatMap;

import java.util.Arrays;
import java.util.List;

import com.Static.Student;

public class DemoStudent{
	String name;
	List<String> subject;
	
	public DemoStudent(String name, List<String> subject) {
		this.name = name;
		this.subject = subject;
	}
}

class Main{
	public static void main(String[] args) 
	{
	
		List<DemoStudent> student = Arrays.asList(new DemoStudent("Zubair",Arrays.asList("Java","SQL","Spring")),
				new DemoStudent("Adil",Arrays.asList("CoreJava","Collection","Spring")),
				new DemoStudent("Dushyany",Arrays.asList("Java","SQL","Hibernate")),
				new DemoStudent("Ahmed",Arrays.asList("Java","MySQL","Spring")));
		
		student.stream()
					.flatMap(x -> x.subject.stream())
					.distinct()
					.forEach(System.out::println);
				
		
	}
}



