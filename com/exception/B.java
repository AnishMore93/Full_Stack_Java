package com.exception;

public class B {
	public static void main(String[] args) {
		try {
		String st="Anish";
		int i=Integer.parseInt(st);
		System.out.println(i);
		}
		
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Data not available");
			
		}
		
		catch(Exception e) {
			System.out.println("Enter numbers only");
			
		}
		
	}

}
