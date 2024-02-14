package com.Array;

public class I {
	public int getMax(int a[]) {
		int num=0;
		int Max=0;
		for(int i=0;i<a.length;i++) {
			if(num<a[i]) {
				num=a[i];
				Max=a[i];
			}
		}
		return Max;
		
	}
	
	public static void main(String[] args) {
		I ai=new I();
		int b[]= {10,80,30,40,100};
		System.out.println(ai.getMax(b));
	}

}
