package com.exception;

public class Demo {
	public static void main(String[] args) {
		try {
//			1000 lines of code
			throw new Myexception();
//			1000 bugs lines code
		}catch(Myexception e) {
//			working code
			System.out.println("Handled");
		}
	}

}
