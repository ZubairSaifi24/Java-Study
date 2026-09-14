package com.TheCollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain
{
    public static void main(String[] args)
    {
        ArrayList<Employee> empList = new ArrayList<>();

        empList.add(new Employee(15,"Adil","Amroha ",23124.4));
        empList.add(new Employee(262,"salamn","Amroha ",224324.4));
        empList.add(new Employee(37,"Aa","Amroha ",234324.4));
        empList.add(new Employee(84,"PT","Amroha ",234324.4));
        empList.add(new Employee(59,"Amri","Amroha ",234324.4));
        empList.add(new Employee(60,"Anil","Amroha ",23324.4));
        empList.add(new Employee(745,"dem","Amroha ",23424.4));
        empList.add(new Employee(834,"action","Amroha ",24324.4));
        empList.add(new Employee(94,"sdf","Amroha ",23434.4));
        empList.add(new Employee(10,"zubair","Amroha ",24324.4));
        empList.add(new Employee(11,"hat","Amroha ",23432.4));


        System.out.println();
        System.out.println(empList);

        Collections.sort(empList);

        System.out.println();
        System.out.println(empList);

    }
}

