package com.Instagram.login;

public class Xyz {
	public static void m1() {
		System.out.println("inside m1");
		
	}
	public void m2() {
		System.out.println("inside m2");
		
	}
	public static void main(String[] args) {
		Xyz.m1();
		Xyz obj = new Xyz();
		obj.m2();
	}

}
