package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws {
	public void m1() throws FileNotFoundException {
		FileInputStream fs=new FileInputStream("\"D:\\TEST.txt\"");
	}
	
	public void m2() throws FileNotFoundException {
		m1();
	}
	
	public void m3() {
		try {
			m2();
		} catch (FileNotFoundException e) {
			
			System.out.println("Handled");
		}	
	}
	public static void main(String[] args) {
		Throws tr=new Throws();
		tr.m3();
		
	}

}
