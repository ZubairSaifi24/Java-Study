package com.flatMap;

class Addres
{
	private String state;
	private String city;
	private String pincode;
	
	public Addres(String state, String city, String pincode) {
		this.state = state;
		this.city = city;
		this.pincode = pincode;	
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Addres [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
}

public class School 
{
	private int id;
	private String name;
	private float marks;
	private Addres address;
	
	public School(int id, String name, float marks, Addres address) {
		
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public Addres getAddress() {
		return address;
	}

	public void setAddres(Addres address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}
	
	
	
}
