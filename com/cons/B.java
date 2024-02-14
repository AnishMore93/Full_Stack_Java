package com.cons;

public class B extends A{
	public void m1() {
		super.m1();
		System.out.println("inside m1");
	}
	B(){
//		super();
		System.out.println("conc B");
	}

}
