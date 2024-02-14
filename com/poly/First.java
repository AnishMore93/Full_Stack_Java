package com.poly;

public class First {
	public void m1() {
		System.out.println("No parameters");
	}
	public void m1(int a) {
		System.out.println("int parameters");
	}
	public void m1(int a, int b) {
		System.out.println("int 1,int 2 parameters");
	}
	public static void main(String[] args) {
		First ft=new First();
		ft.m1();
		ft.m1(10);
		ft.m1(10, 20);
	}

}
