package com.Exam;

import java.util.Scanner;

public class Operations{
	
		
		public void getcardetails() {
			Harrier hr=new Harrier();
			hr.getcardetails();
			hr.getModel();
			hr.getYear();
		}
		public void getMotorcycledetails() {
			Ninja nj=new Ninja();
			nj.getMotorcycledetails();
			nj.getModel();
			nj.getYear();
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Press 1 for cardetails\nPress 2 for motorcycle");
			int ch=sc.nextInt();
			Operations or=new Operations();
			switch(ch) {
			case 1:
				or.getcardetails();
				break;
			case 2:
				or.getMotorcycledetails();
				break;
			
			
			}
		
		}
		
		
		
	}
	
	

