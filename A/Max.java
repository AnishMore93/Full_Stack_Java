package com.A;

public class Max {
	static int a=10;
	static int b=20;
	static int c=12;
	
	public static void main(String[] args) {
		if(a<b) {
			System.out.println("b is maximum");
		}
		else if(a<c) {
			System.out.println("c is maximum");
		}
		else {
			System.out.println("a is maximum");
		}
	}
}
