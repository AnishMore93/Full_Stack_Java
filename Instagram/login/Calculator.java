package com.Instagram.login;

public class Calculator {
	int a=10;
	int b=20;
	
	public void getAddition() {
		int c= a+b;
		System.out.println(c);
		
	}
	public void getSubstraction() { 
		int d= b-a;
		System.out.println(d);
		
	}
	public void getMultiplication() {
		int e= a*b;
		System.out.println(e);
		
	}
	public void getDivision() {
		int f= b/a;
		System.out.println(f);
		
	}
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		obj.getAddition();
		obj.getSubstraction();
		obj.getMultiplication();
		obj.getDivision();
	}

}
