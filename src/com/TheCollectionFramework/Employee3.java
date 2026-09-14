package com.TheCollectionFramework;

public class Employee3 
{
	private int id;
	private String name;
	private String address;
	private double salary;
	
	public Employee3(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public String toString() {
		return "\nEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
	}
	
}
