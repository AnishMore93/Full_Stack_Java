package com.exception;

public class Test {
	public void m1() throws CusCompile {
		throw new CusCompile();
	}
	
	public void m2() throws CusCompile {
		m1();
	}
	
	public void m3() {
		try {
			m2();
		} catch (CusCompile e) {
			System.out.println("Handled");
		}
	}
	public static void main(String[] args) {
		Test tt=new Test();
		tt.m3();
	}
	

}
