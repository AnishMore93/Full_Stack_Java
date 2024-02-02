package com.A;

import java.util.Scanner;

public class Operations {
	public static void getTata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Altroz\nPress 2 for Harrier\nPress 3 for Maruti ");
		int ch=sc.nextInt();
		Tata td=new Tata();
		switch(ch) {
		case 1:
			td.getAltroz();
			break;
		case 2:
			td.getHarrier();
			break;
		case 3:
			td.getMaruti();
			break;
		default:
			System.out.println("Invalid Option1");
		}
	}
	public static void getToyata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Innova\nPress 2 for Crysta\nPress 3 for Fortuner ");
		int ch=sc.nextInt();
		Toyata ta=new Toyata();
		switch(ch) {
		case 1:
			ta.getInnova();
			break;
		case 2:
			ta.getCrysta();
			break;
		case 3:
			ta.getFortuner();
			break;
		default:
			System.out.println("Invalid Option2");
		}
		}
		public static void getMahendra() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Press 1 for Xuv\nPress 2 for Thar\nPress 3 for Scorpio ");
			int ch=sc.nextInt();
			Mahendra ma=new Mahendra();
			switch(ch) {
			case 1:
				ma.getXuv();;
				break;
			case 2:
				ma.getThar();
				break;
			case 3:
				ma.getScorpio();
				break;
			default:
				System.out.println("Invalid Option3");
			}
		
	}

}
