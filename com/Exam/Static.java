package com.Exam;



public class Static {
	public void m1() {
		Static st=new Static();
		System.out.println("Non static m1");	
	}
	public static void m2() {
		System.out.println("Static m2");
	}
	public static void main(String[] args) {
		Static st=new Static();
		st.m1();
		Static.m2();
	}

}
