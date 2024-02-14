package com.enproduct;
import java.util.*;
public class app {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {	
	while(true) {
		System.out.println("******************Wellcome********************");
		System.out.println("Press 1 for Product "+"\nPress 2 for getdata"+"\nPress 3 for Update"+"\nPress 4 for Billing");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			data.setdata();
			prodata.setinfo();
			break;
			
		case 2:
			data.getdata();
			break;
		case 3:
			data.updatedata();
			break;
		case 4:
			prodata.getinfo();
			break;
		}
		
	}}
	
	

}