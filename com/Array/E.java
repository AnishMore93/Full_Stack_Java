package com.Array;

public class E {
	public int Even(int a[]) {
		int count = 0;
		for(int i=0;i<a.length;i++) {
			int num = a[i];
			if(num%2==0) {
				count++;
			}
			
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		E ae=new E();
		int b[]= {11,13,30,40,55};
		System.out.println(ae.Even(b));
	}

}
