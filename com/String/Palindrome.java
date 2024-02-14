package com.String;

public class Palindrome {
	
	
	public boolean getReverse(String myString) {
		boolean res=false;
		String reverse="";

		for(int i=myString.length()-1;i>=0;i--) {
			reverse = reverse + myString.charAt(i);
		}
		if(reverse.equals(myString)) {
			res=true;
		}
		else {
			res=false;
		}
		
		return res;
		
		
	}
	
	
	
	public static void main(String[] args) {
		Palindrome p=new Palindrome();
		System.out.println(p.getReverse("mom"));
		
	}

}
