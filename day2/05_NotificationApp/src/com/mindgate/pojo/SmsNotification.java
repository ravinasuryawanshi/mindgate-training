package com.mindgate.pojo;

import com.mindgate.service.Notification;

public class SmsNotification implements Notification{
	public void sendNotification(String to,String msg)
	{
		System.out.println("sending SMS notification");
		System.out.println("to ::"+to);
		System.out.println("msg ::"+msg);
		
	}

	@Override
	public void sendNotification(String email) {
		// TODO Auto-generated method stub
		
	}
}
