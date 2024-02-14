package com.exception;

public class C {
	public static void main(String[] args) {
		int a[]= {10,20,30};
		try {
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Data not available");
				
			}
			catch(Exception e) {
				System.out.println("Data not available 2");
				
			}
		finally {
			System.out.println("program");
		}
		
		
	}
	
	

}
