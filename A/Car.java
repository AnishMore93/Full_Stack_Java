package com.A;

import java.util.Scanner;

public class Car {
	public static void main(String[] args) {
		
		System.out.println("Choose Your Favourite car company");
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Tata\nPress 2 for Toyata\nPress 3 for Mahendra");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Welcome to tata");
			Operations.getTata();
			break;
		case 2:
			System.out.println("Welcome to Toyata");
			Operations.getToyata();
			break;
		case 3:
			System.out.println("Welcome to Mahendra");
			Operations.getMahendra();
			break;
		}
		
			
		
	}

}
