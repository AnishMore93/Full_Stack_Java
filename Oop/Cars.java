package com.Oop;

import java.util.Scanner;


public class Cars {
public static void main(String[] args) {
	System.out.println("Choose car company");
	Scanner sc=new Scanner(System.in);
	System.out.println("Press 1 for Tata\nPress 2 for Bmw\nPress 3 for Mahendra");
	int ch=sc.nextInt();
	switch(ch) {
	case 1:
		System.out.println("Welcome to tata");
		Tata.setTata();
		break;
	case 2:
		System.out.println("Welcome to Bmw");
		Bmw.setBmw();
		break;
	case 3:
		System.out.println("Welcome to Mahendra");
		Mahendra.setMahendra();
		break;
		
	default:
		System.out.println("invalid");
	}
}
}
