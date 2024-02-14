package com.encapsulation;

import java.util.Scanner;

public class MyApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Press 1 for set Employee Data\nPress 2 for get Employee Data\nPress 3 for update Employee Information");
			switch(sc.nextInt()) {
			case 1:
				App.setData();
				break;
			case 2:
				App.getData();
				break;
			case 3:
				App.updateData();
				break;
			}
			
		}
		
	}

}
