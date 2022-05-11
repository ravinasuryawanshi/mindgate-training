package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountApplicationMainV2 {
	public static void main(String[] args) {
		Account account=new Account(101, "ravina patil", 1000);
		boolean result=account.withdraw(800);
		if(result) {
			System.out.println("transaction completed successfully");
			System.out.println("balance::"+account.getBalance());
		}
		else
		{
			System.out.println("transaction failed");
			System.out.println("balance::" +account.getBalance());
		}
				System.out.println("-".repeat(50));
				result=account.deposit(1000);
				if(result) {
					System.out.println("transaction completed successfully");
					System.out.println("balance::"+account.getBalance());
				}
				else
				{
					System.out.println("transaction failed");
					System.out.println("balance::" +account.getBalance());
				}
	}
}
