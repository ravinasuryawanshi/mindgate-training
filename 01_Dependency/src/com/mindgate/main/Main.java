package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class Main {
	public static void main(String[] args) {
		Address homeAddress = new Address(1, "colony", "vadodara", "gujarat");
		Employee employee = new Employee(101, "ravina", 2000, homeAddress);
		System.out.println(employee);

	}
}
