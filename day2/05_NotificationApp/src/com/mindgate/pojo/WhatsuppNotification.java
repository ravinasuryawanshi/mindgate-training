package com.mindgate.pojo;

import com.mindgate.service.Notification;

public class WhatsuppNotification implements Notification {

	public void sendNotification(String to,String msg)
	{
		System.out.println("sending whatsup notification");
		System.out.println("to ::"+to);
		System.out.println("msg ::"+msg);
	}
	
}
