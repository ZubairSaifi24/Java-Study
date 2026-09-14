package com.TheCollectionFramework;

public class Employee implements Comparable<Employee>
{

    private int id;
    private String ename;
    private String address;
    private double salary;

    public Employee(int id, String ename, String address, double salary) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
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

    @Override
    public int compareTo(Employee e) {

        if(e.getId() == this.getId())
            return 0;
        else if(e.getId() > this.getId())
            return -1;
        else
            return 1;
    }
}
