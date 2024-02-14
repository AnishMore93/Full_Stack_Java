package com.Exam;

import java.util.Scanner;

public class Balance {
	static Scanner sc=new Scanner(System.in);
	static BankAccount ba=new BankAccount();
	public static void setbankinfo() {
		System.out.println("Enter Current Balance: ");
		int currentbalance=sc.nextInt();
		ba.setCurrentbalance(currentbalance);
		System.out.println("Enter Deposited Money: ");
		int depositmoney=sc.nextInt();
		ba.setdepositmoney(depositmoney);
		int balance=currentbalance+depositmoney;
		ba.setBalance(balance);
		
	}
	
	public static void getbankinfo() {
		System.out.println("Deposited Money:"+ba.getdepositmoney());
		System.out.println("Account Balance:"+ba.getBalance());
	}

}
