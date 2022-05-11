package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;

public class AccountApplicationMainV3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int choice;
		String ch;
		double amount;
		boolean result;
		String continueChoice;
		
		System.out.println("Welcome to xyz bamnk");
		System.out.println("enter account number");
		int number=scanner.nextInt();
		
		System.out.println("enter name");
		String name=scanner.next();
		
		System.out.println("enter balance");
		double balance=scanner.nextDouble();
		
		
		Account account= new Account(number, name, balance);
		System.out.println("Account opened Successfully");
		do
		{
		System.out.println();
		System.out.println("1.withdraw ");
		System.out.println("2.deposit");
		System.out.println("3..getbalance");
		System.out.println("enter choice");
		choice=scanner.nextInt();
		
		
			
		switch(choice)
		{
			case 1:  
						System.out.println("enter amount to be withdraw");
						amount=scanner.nextDouble();
						result= account.withdraw(amount);
						if(result)
						{
							System.out.println("withdraw successfully");
							System.out.println("balance::"+account.getBalance());
						}
						else
						{
							System.out.println("withdraw failed");
							System.out.println("balance::" +account.getBalance());
						}
						
							break;
			case 2:		System.out.println("enter deposit amount");
							amount=scanner.nextDouble();
								result= account.deposit(amount);
						if(result)
						{
							System.out.println("deposit successfully");
							System.out.println("balance::"+account.getBalance());
						}
						else
						{
							System.out.println("deposit failed");
							System.out.println("balance::" +account.getBalance());
						}
			
			
					
							break;
			case 3:		System.out.println(" balance"+account.getBalance());
			             
			             	break;
			default: System.out.println("invalid");
		}
	
			System.out.println("do you want to continue y or n");
		continueChoice=scanner.next();
		}while(continueChoice.equals("yes"));
		System.out.println("thank you for banking with us");
	}
		
		
	
}
