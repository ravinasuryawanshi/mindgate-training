package com.mindgate.pojo;

import com.mindgate.service.Notification;

public class EmailNotification implements Notification{
	
	@Override
	public void sendNotification(String to, String msg) {
		System.out.println("sending SMS notification");
		System.out.println("to ::"+to);
		System.out.println("msg ::"+msg);
	}

	

	
		
	
}
