package com.flatMap;

class Address{
	private String country;
	private String State;
	private String district;
	private String city;
	private String pincode;
	
	public Address() {
	}
	
	public Address(String country, String state, String district, String city, String pincode) {
		this.country = country;
		State = state;
		this.district = district;
		this.city = city;
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
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
		return "Address [country=" + country + ", State=" + State + ", district=" + district + ", city=" + city
				+ ", pincode=" + pincode + "]";
	}
	
	
}

public class Employee
{
    private int id;
    private String ename;
    private Address address;
    private double salary;

    public Employee(int id, String ename, Address address, double salary) {
        this.id = id;
        this.ename = ename;
        this.address = address;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }

}