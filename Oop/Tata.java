package com.Oop;

import java.util.Scanner;

public class Tata extends Cars{
	public static void setTata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Altroz\nPress 2 for Harrier");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Welcome to Altroz");
			Altroz.setAltroz();
			break;
		case 2:
			System.out.println("Welcome to Harrier");
			Harrier.setHarrier();
			break;
			}
		}
	}
