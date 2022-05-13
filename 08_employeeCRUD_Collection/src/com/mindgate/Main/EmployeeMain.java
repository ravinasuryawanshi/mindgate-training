package com.mindgate.Main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.mindgate.dao.EmployeeDao;
import com.mindgate.pojo.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		int empid;
		String name;
		double salary;
		int a;
		Employee employee1=null;
		// Employee employee2;
		EmployeeDao emDao = new EmployeeDao();
		do {
			System.out.println("1.Add New Employee");
			System.out.println("2.Update Employee Details");
			System.out.println("3.Delete Employee Details by id");
			System.out.println("4.Get Single Employee Details by Id");
			System.out.println("5.Get All Details");

			System.out.println("Enter Choice");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter employeeId");
				empid = scanner.nextInt();
				System.out.println("Enter employee name");
				name = scanner.next();
				System.out.println("Enter employee Salary");
				salary = scanner.nextInt();
				employee1 = new Employee(empid, name, salary);

				if (emDao.addNewEmployee(employee1)) {
					System.out.println("ADDED SUCCESSFULLY");
				} else {
					System.out.println("Not Added");
				}

				break;
			case 2:
				System.out.println("Enter employeeId");
				empid = scanner.nextInt();
				System.out.println("Enter employee name");
				name = scanner.next();
				System.out.println("Enter employee Salary");
				salary = scanner.nextInt();
				employee1.setEmpid(empid);
				employee1.setName(name);
				employee1.setSalary(salary);
				employee1 = new Employee(empid, name, salary);
				if (emDao.updateEmployee(employee1)) {
					System.out.println("updeted");
				} else {
					System.out.println("not updeted");
				}
				break;
			case 3:
				System.out.println("Enter employeeId");
				empid = scanner.nextInt();
				if (emDao.deleteEmployeeByEmployeeId(empid)) {
					System.out.println("deleted");    
				} else {
					System.out.println("not dleted");
				}
				break;
			case 4:
				System.out.println("Enter employeeId");
				empid = scanner.nextInt();
				employee1 = emDao.getEmployeeByEmployeeId(empid);
				System.out.println(employee1.getEmpid());
				System.out.println(employee1.getName());
				System.out.println(employee1.getSalary());
				break;

			case 5:
				Set<Employee> employeeset=emDao.getAllEmployees();
				System.out.println(employeeset);
				break;

			}

			System.out.println("continue to press 1");
			a = scanner.nextInt();
		} while (a == 1);

	}
}
