package com.Static;

public class Second {
	public void m1() {
		System.out.println("inside m1");
	}
	Second(){
//		
	}
	public static void main(String[] args) {
		Second obj=new Second();
		obj.m1();
	}

}
