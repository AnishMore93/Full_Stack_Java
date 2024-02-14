package com.Exam;

public class Calculator {
	static int a=10;
	static int b=20;
	static int z=30;
	
	public void getAddition(int a, int b) {
		int c= a+b;
		System.out.println(c);	
	}
	public void getAddition() {
		int c= a+b;
		System.out.println(c);
	}
	public void getAddition(int a, int b,int z) {
		int x=a+b+z;
		System.out.println(z);
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
		obj.getAddition(a, b);
		obj.getAddition();
		obj.getAddition(a, b, z);
		obj.getSubstraction();
		obj.getMultiplication();
		obj.getDivision();
	}

}
