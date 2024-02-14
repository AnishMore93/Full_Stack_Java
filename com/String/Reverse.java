package com.String;

public class Reverse {
	public static String getReverse(String myString) {
		String reverse="";
		for(int i=myString.length()-1;i>=0;i--) {
			reverse = reverse + myString.charAt(i);
			
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		System.out.println(Reverse.getReverse("abcd"));
	}
	

}
