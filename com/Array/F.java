package com.Array;

public class F {
	public int Square(int a[]) {
		int count = 0;
		for(int i=0;i<a.length;i++) {
			int num=a[i];
			int d=num*num;
			count=count+d;
			
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		
		F af=new F();
		int b[]= {11,13,30,40,55};
		System.out.println(af.Square(b));
		
	}

}
