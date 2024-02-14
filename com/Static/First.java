package com.Static;
//Constructor overloading
public class First {
	public First() {
		System.out.println("without parameters");
		
	}
	public First(int a) {
		System.out.println("int parameters");
	
	}
	public First(int a,String b) {
		System.out.println("int,string parameters");
		
	}
	public static void main(String[] args) {
		First obj=new First(10);
	}

}
