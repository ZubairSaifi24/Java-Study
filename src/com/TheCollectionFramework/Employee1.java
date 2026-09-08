package com.TheCollectionFramework;

public class Employee1 
{
	private int  id;
	private String name;
	private String address;
	private String college;
	
	public Employee1(int id, String name, String address, String college) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.college = college;
	}

	@Override
	public String toString() {
		return "\nEmployee1 [id=" + id + ", name=" + name + ", address=" + address + ", college=" + college + "]";
	}
	
	
}
