package com.mindgate.dao;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class EmployeeDao {

	private Set<Employee> employeeset=new HashSet<Employee>();
	
	public boolean addNewEmployee(Employee employee)
	{//if(employee!=null)
	return employeeset.add(employee);
	
		
		
	}
	public boolean updateEmployee(Employee employee)
	{
		for (Employee employee1 : employeeset) {
			if(employee1.getEmpid()==employee.getEmpid()) {
			employee1.setName(employee.getName());
			employee1.setSalary(employee.getSalary());
			return true;
			
		}
	}
		return false;
	}
	public boolean deleteEmployeeByEmployeeId(int empid) {
		for (Employee employee1: employeeset) {
			if(employee1.getEmpid()==empid) {
				employeeset.remove(employee1); 
			}
			return true;
		}
		return false;
	}
	
	public Employee getEmployeeByEmployeeId(int empid) {
		for (Employee employee : employeeset) {
			if(employee.getEmpid()==empid) {
				return employee;
				
			}
			
		}
		return null;
	}
	public Set<Employee> getAllEmployees(){
		return employeeset;
	}
	
}
                             