package com.abstraction;

import java.util.Scanner;

public class Operations {
	public void getMsdealers() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Swift\nPress 2 for Baleno");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Welcome to Swift");
			Swift st=new Swift();
			st.getMsdealers();
			st.getMillage();
			st.getColours();
			st.getPrice();
			st.getFeature();
			break;
		case 2:
			System.out.println("Welcome to Baleno");
			Baleno bt=new Baleno();
			bt.getMsdealers();
			bt.getMillage();
			bt.getColours();
			bt.getPrice();
			bt.getFeature();
			
			break;
			
		default:
			System.out.println("invalid");
		}
		
	}
	public void getTatainfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Thar\nPress 2 for Harrier");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Welcome to Thar");
			Thar tr=new Thar();
			tr.getCar();
			tr.getTatainfo();
			tr.getMillage();
			tr.getColours();
			tr.getPrice();
			tr.getFeature();
			break;
		case 2:
			System.out.println("Welcome to Harrier");
			Harrier hr=new Harrier();
			hr.getCar();
			hr.getTatainfo();
			hr.getMillage();
			hr.getColours();
			hr.getPrice();
			hr.getFeature();
			break;
			
		default:
			System.out.println("invalid");
		}
		
		
	}
	public void getBmwinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for X5\nPress 2 for X6");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Welcome to X5");
			X5 xobj=new X5();
			xobj.getCar();
			xobj.getBmwinfo();
			xobj.getColours();
			xobj.getMillage();
			xobj.getPrice();
			xobj.getFeature();
			break;
		case 2:
			System.out.println("Welcome to x6");
			X6 x=new X6();
			x.getCar();
			x.getBmwinfo();
			x.getColours();
			x.getMillage();
			x.getPrice();
			x.getFeature();
			break;
			
		default:
			System.out.println("invalid");
		}
		
		
	}
	public static void main(String[] args) {
		System.out.println("Choose car company");
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Ms\nPress 2 for Tata\nPress 3 for Bmw");
		int ch=sc.nextInt();
		Operations or=new Operations();
		
		switch(ch) {
		case 1:
			System.out.println("Welcome to Ms");
			or.getMsdealers();
			break;
		case 2:
			System.out.println("Welcome to Tata");
			or.getTatainfo();
			break;
		case 3:
			System.out.println("Welcome to Bmw");
			or.getBmwinfo();
			break;
			
		default:
			System.out.println("invalid");
		}
	}

}
