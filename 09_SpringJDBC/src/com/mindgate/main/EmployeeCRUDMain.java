package com.mindgate.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeCRUDMain {
	public static void main(String[] args) {

		Employee employee = new Employee(1, "ravina", 2000);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		EmployeeServiceInterface employeeServiceInterface = applicationContext.getBean("employeeService",
				EmployeeService.class);
//		boolean result = employeeServiceInterface.addNewEmployee(employee);
//		if (result) {
//			System.out.println("Employee added successfully");
//		} else {
//			System.out.println("failed to add");
//		}
		
//		List<Employee> allEmployee=employeeServiceInterface.getAllEmployee();
//		for (Employee emp : allEmployee) {
//			System.out.println(emp);
//		}
//		
//		System.out.println("_".repeat(50));
		
//		Employee ravina=employeeServiceInterface.getEmployeeByEmployeeId();
//		System.out.println(ravina);
		Employee emp= new Employee(1,"spring",2000);
		boolean result = employeeServiceInterface.updateEmployee(emp);
		if (result) {
			System.out.println("Employee updated successfully");
		} else {
			System.out.println("failed to update employee");
		}
		
		 
		
	}
}
