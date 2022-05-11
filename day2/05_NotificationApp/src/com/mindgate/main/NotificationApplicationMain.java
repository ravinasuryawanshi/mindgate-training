package com.mindgate.main;


import java.util.Scanner;

import com.mindgate.Factory.Factoryyy;
import com.mindgate.pojo.EmailNotification;
import com.mindgate.pojo.SmsNotification;
import com.mindgate.service.Notification;

public class NotificationApplicationMain {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String to;
	String msg;
	String email;
	int choice;
	
	System.out.println("1.SMS Notication");
	System.out.println("2.Email Notification");
	System.out.println("3.whatsup Notification");
	System.out.println("enter choice");
	choice=scanner.nextInt();
	
	System.out.println("Enter contact");
	to=scanner.next();
	scanner.nextLine();
	System.out.println("Enter message");
	
	msg=scanner.nextLine();
	Notification notification=Factoryyy.getnotification(choice);
	notification.sendNotification(to, msg);
	
}
}
