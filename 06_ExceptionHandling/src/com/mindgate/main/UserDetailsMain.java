package com.mindgate.main;

import com.mindgate.pojo.UserDetails;

public class UserDetailsMain {
	public static void main(String[] args) {
		UserDetails userdetails=new UserDetails();
		System.out.println("Main start");
		userdetails.acceptUserDetails();
		userdetails.displayUserDetails();
		System.out.println("main end");
		
		try {
			Class.forName("com.mindgate.pojo.UserDetails");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		}
}
