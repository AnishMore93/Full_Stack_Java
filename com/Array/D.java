package com.Array;

public class D {
	public boolean findnumber(int a[],int num) {
	
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				return true;
			}
			
			
		}
		return false;
		
		
		
	}
	
	public static void main(String[] args) {
		D ab=new D();
		int b[]= {10,20,30,40,50};
		System.out.println(ab.findnumber(b, 10));
	}

}

