package com.mindgate.Factory;

import com.mindgate.pojo.EmailNotification;
import com.mindgate.pojo.SmsNotification;
import com.mindgate.pojo.WhatsuppNotification;
import com.mindgate.service.Notification;

public class Factoryyy {
	Notification notification;
	public static Notification getnotification(int choice) {
		Notification notification=null;
		switch(choice)
		{
		case 1: 
			notification=new SmsNotification();
			break;
		case 2:
			notification=(Notification) new EmailNotification();
			break;
		case 3: 
			notification=(Notification) new WhatsuppNotification();
			break;
		

		}
		return notification;
	}
}
