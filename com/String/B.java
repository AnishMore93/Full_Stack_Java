package com.String;

public class B {
	public String getUl(String my) {
		String n="";
		
		for(int i=0;i < my.length();i++) {
			
			if(i==0) {
				n=n+my.toUpperCase().charAt(i);
			}else if(i%2!=0) {
				n=n+my.toLowerCase().charAt(i);
			}else if(i%2==0) {
				n=n+my.toUpperCase().charAt(i);
			}
			
		}
		
		return n;
		
	}
	public static void main(String[] args) {
		B obj=new B();
		System.out.println(obj.getUl("anish"));
	}

}
