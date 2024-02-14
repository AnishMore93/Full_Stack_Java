package com.Exam;

import java.util.Scanner;

public class positive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		int i=sc.nextInt();
		do {
			System.out.println(i);
			
		}while(i<0);
		
		
	}

}
