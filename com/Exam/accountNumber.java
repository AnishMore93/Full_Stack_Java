package com.Exam;

import java.util.Scanner;


public class accountNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Press 1 for set bank info\nPress 2 for get bank info");
			switch(sc.nextInt()) {
			case 1:
				Balance.setbankinfo();
				break;
			case 2:
				Balance.getbankinfo();
				break;
			
			}
			
		}
		
	}

}
