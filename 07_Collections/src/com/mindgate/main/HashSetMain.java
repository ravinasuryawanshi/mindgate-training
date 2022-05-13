package com.mindgate.main;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class HashSetMain {
public static void main(String[] args) {
	Set<String> nameset=new HashSet<String>();
	nameset.add("ravina");
	nameset.add("kajal");
	nameset.add("ravina");
	nameset.add("yash");
	nameset.add("kajal");
	System.out.println(nameset);
	System.out.println("-".repeat(50));
	Employee employee=new Employee(101, "ravina", 1000);
	System.out.println(employee.hashCode());
	Employee employee1=new Employee(102, "kajal", 8000);
	System.out.println(employee1.hashCode());
	Employee employee2=new Employee(101, "ravina", 1000);
	System.out.println(employee2.hashCode());
	Employee employee3=new Employee(103, "ravi", 5000);
	System.out.println(employee3.hashCode());
	
	Set<Employee> employeeset=new HashSet<Employee>();
	employeeset.add(employee);
	employeeset.add(employee1);
	employeeset.add(employee2);
	employeeset.add(employee3);
	
	for (Employee employee4 : employeeset) {
		System.out.println(employee4);
		
	}
	Integer i=Integer.valueOf(10);
	System.out.println(i.hashCode());
	 String s=new String("hii");
	 System.out.println(s.hashCode());
	 s=s+"hello";
	 System.out.println(s.hashCode());
	
}
}
