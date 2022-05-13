package com.mindgate.main;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.ArraylistDemo;
import com.mindgate.pojo.Employee;

public class ArrayListMain {
	public static void main(String[] args) {
		
		ArraylistDemo arraylistdemo=new ArraylistDemo();
		List<String> namelist=new ArrayList<String>();
		namelist.add("ravina");
		namelist.add("kajal");
		namelist.add("yash");
		arraylistdemo.setArraylistid(101);
		arraylistdemo.setNameList(namelist);
		System.out.println(arraylistdemo);
		System.out.println("-".repeat(50));
		List<Integer> numberlist=new ArrayList<Integer>();
		numberlist.add(101);
		numberlist.add(102);
		numberlist.add(103);
		numberlist.add(101);
		System.out.println(numberlist);
		System.out.println("-".repeat(50));
		
		Employee employee=new Employee(101, "ravina", 1000)	;
		Employee employee1=new Employee(102, "kajal", 2000)	;
		Employee employee2=new Employee(101, "yash", 2000)	;
		Employee employee3=new Employee(103, "tina", 4000)	;
		
		List<Employee> emplyeelist=new ArrayList<Employee>();
		
		emplyeelist.add(employee);
		emplyeelist.add(employee1);
		emplyeelist.add(employee2);
		emplyeelist.add(employee3);
		System.out.println(emplyeelist);
		System.out.println("-".repeat(50));
		for (Employee employee4 : emplyeelist) {
			System.out.println(employee4);
			
		}
		
				}
}
