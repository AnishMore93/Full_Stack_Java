package com.exception;

public class A {
	public static void main(String[] args) {
		try {
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
		}catch(Exception e) {
			System.out.println("can not divided by zero");
			
		}
	}

}
//death of screen