package com.Static;
//static overloading

public class Test {
	public static void m1() {
		System.out.println("without parameters");
	}
	public static void m1(int a) {
		System.out.println("int parameters");
	}
	public static void m1(int a, String b) {
		System.out.println("int,string parameters");
	}
	public static void main(String[] args) {
		Test.m1();
		Test.m1(10);
		Test.m1(5, "string");
	}



}
