package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Employee;

public class EmployeeMain {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int employeeId;
	String name;
	double salary;
	System.out.println("enter employeeid");
	employeeId=scanner.nextInt();
	
	System.out.println("enter name");
	name=scanner.next();
	
	System.out.println("enter salary");
	salary= scanner.nextDouble();
	

	Employee employee=new Employee();
	employee.setEmployeeId(employeeId);
	employee.setName(name);
	employee.setSalary(salary);
	
	System.out.println(employee.getEmployeeId());
	System.out.println(employee.getName());
	System.out.println(employee.getSalary());
	System.out.println("-".repeat(50)); 
	
	
	Employee employee2=new Employee(102, "Kajal", 5000);
	System.out.println(employee2.getEmployeeId());
	System.out.println(employee2.getName());
	System.out.println(employee2.getSalary());
}
}
