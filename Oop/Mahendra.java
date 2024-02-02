package com.Oop;

import java.util.Scanner;

public class Mahendra {
	public static void setMahendra() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Thar\nPress 2 for Scorpio");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Welcome to Thar");
			Thar.setThar();
			break;
		case 2:
			System.out.println("Welcome to Scorpio");
			Scorpio.setScorpio();
			break;
			}
		}


}
