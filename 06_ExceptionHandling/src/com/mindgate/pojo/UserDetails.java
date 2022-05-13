package com.mindgate.pojo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserDetails {
	private int userId;
	private String name;
	private int age;
	
	public void acceptUserDetails() {
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter user Id");
			userId=scanner.nextInt();
			System.out.println("enter user name");
			name=scanner.next();
			System.out.println("enter user age");
			age=scanner.nextInt();
			
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("invalid input from user");
			System.out.println("please enter valid input");
		}
		
		
		}
	public void displayUserDetails() {
		System.out.println("user id"+userId);
		System.out.println("name="+name);
		System.out.println("age="+age);
	}
}
