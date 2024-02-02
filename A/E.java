package com.A;

public class E {
	{
		System.out.println("inside static block");
	}
	public void m1() {
		E ab=new E();
		System.out.println("m1");	
	}
	public static void main(String[] args) {
		E ab=new E();
		ab.m1();
	}
	

}
//if we use static keyword then it will execute once
//if there is no static then it is non static block