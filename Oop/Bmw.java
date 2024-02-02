package com.Oop;

import java.util.Scanner;

public class Bmw extends Cars{
	public static void setBmw() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for x5\nPress 2 for x6");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Welcome to X5");
			X5.setX5();
			break;
		case 2:
			System.out.println("Welcome to X6");
			X6.setX6();
			break;
			}
		}

}
