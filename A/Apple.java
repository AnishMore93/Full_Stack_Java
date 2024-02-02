package com.A;

public class Apple {
	public Apple() {
		System.out.println("constructor");
	}
	{
		System.out.println("non static");
	}
	static {
		System.out.println("static");
	}
	

}
//first static block then non static block then constructor is executed